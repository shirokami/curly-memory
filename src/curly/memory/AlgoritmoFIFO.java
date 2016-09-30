/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curly.memory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HDEZ. OCHOA D. SEBASTIAN
 */
public class AlgoritmoFIFO extends Simulador implements Runnable{
    
    
    //Metodo que inicia el procedimiento de manera asincrona (paralela por medio de un hilo)
    @Override
    public void run() {
        //Comienza a trabajar el algoritmo fifo
        ComenzarFifo();
    }
    
     //Metodo para iniciar planificacion FIFO
    public  void ComenzarFifo(){
        System.out.println("*-*-*-*-*-*-*-*-*-  COMIENZA FIFO *-*-*-*-*-*-*-*-*-*-*-*");
        //Recorremos la lista de procesos
        for(int i=0;i<procesos_listos.length;i++){
            //Verificamos que en la posiciin i se encuentre un objeto
            if (procesos_listos[i]!=null){
                //Asignamos el instante de llegada al proceso
                procesos_listos[i].setInstanteDeLlegada(tiempo_cpu);
                System.out.println("El proceso "+procesos_listos[i].getNombre()+" - tiene un tiempo te espera de "+tiempo_cpu);
                
                procesos_listos[i].setEstado(Proceso.ESTADO_EN_EJECUCION);
                System.out.println("El proceso "+procesos_listos[i].getNombre()+" - Cambio estado a ejecucion");
                
                //Mientras el proceso no haya terminado se estara trabajando en 'el
                //Por ser FIFO el tiempo de espera sera igual al tiempo del cpu
                //procesos_listos[i].setTiempoDeEspera(tiempo_cpu);
                
                if(procesos_listos[i].requiereEntradaSalida()){
                    solicitarRecurso(procesos_listos[i]);
                }
                
                if(procesos_listos[i].getEstado()==Proceso.ESTADO_EN_EJECUCION){
                    while(procesos_listos[i].getProgreso()<100){
                        //Se aumenta una unidad de tiempo a el procesador
                        tiempo_cpu++;
                        ActualizarTiempoDeEsperaDeTodosLosProcesos(procesos_listos[i]);
                        //Se actualiza el progreso del proceso
                        procesos_listos[i].actualizarProgreso();
                        System.out.println("El proceso "+procesos_listos[i].getNombre()+" - tiene un tiempo de ejecucion de "+procesos_listos[i].getTiempo_de_ejecucion());
                        System.out.println("El proceso lleva un progreso de "+procesos_listos[i].getProgreso()+"%");
                        //si el progreso esta terminado se actualiza su estado
                        if (procesos_listos[i].getProgreso()==100){
                            //se cambia el estado del proceso a terminado
                            procesos_listos[i].setEstado(Proceso.ESTADO_TERMINADO);
                            System.out.println("El proceso "+procesos_listos[i].getNombre()+" - Cambio estado a terminado");
                            //se asigna el instante de fin
                            procesos_listos[i].setInstante_de_fin(tiempo_cpu);
                            System.out.println("El proceso "+procesos_listos[i].getNombre()+" - termino el en el momento "+tiempo_cpu);
                            //se calcula el tiempo de servicio del proceso
                            procesos_listos[i].calcularTiempoDeServicio();
                            System.out.println("El proceso "+procesos_listos[i].getNombre()+" - tuvo un tiempo de servicio de "+procesos_listos[i].getTiempo_de_servicio());
                       }
                        try {
                            //Actaualizamos la tabla de procesos
                            InterfazG.actualizarTablaRes(procesos_listos);
                            //Actaualizamos la etiqueta de que proceso se esta atentiendo
                            InterfazG.actualizarLabelEjecutando(String.valueOf(procesos_listos[i].getPid()));
                            //Actaualizamos la barra de progreso
                            InterfazG.actulizarBarraDeProgreso(procesos_listos[i].getProgreso());
                            //Relentizamos (alargamos) el proceso 700 milisegundos
                            java.lang.Thread.sleep(700);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(AlgoritmoFIFO.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } 
                }
                //Actaualizamos la tabla de procesos
                InterfazG.actualizarTablaRes(procesos_listos);
            }
        }
        System.out.println("*-*-*-*-*-*-*-*-*-  Termina FIFO *-*-*-*-*-*-*-*-*-*-*-*");
        InterfazG.algoritmoTerminado();
    } 
    
    
}
