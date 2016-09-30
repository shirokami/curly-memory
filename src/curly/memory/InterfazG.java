/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//*****************************************************************************************************************


//*****************************************************************************************************************
//interfaz
package curly.memory;

import java.util.Random;
import javax.swing.*;
import javax.swing.table.TableModel;

/**
 *
 * @author HDEZ. OCHOA D. SEBASTIAN
 */
public class InterfazG extends javax.swing.JFrame {
    
    //Variables que permiten a las clases de Simulador, FIFO, SJN, etc.. puedan acceder y modificar
    //la interfaz grafica
    static TableModel model;
    static JProgressBar barra;
    static JButton btn_iniciar;
    static JButton btn_parar;
    static JTable tabla;
    static JLabel ej_etiqueta;
    
    //Se declara una variable que contendra al algoritmo (FIFO, SJN) que se esta ejecutando
    static Thread hilo_ejecutando;
   
    /**
    * Creates new form InterfazG
    */
    public InterfazG() {
        //Se cargan los componentes de la interfaz grafica
        initComponents();
        //Se prepara la lista de procesos y el ambiente de simulacion
        Simulador.inicializar();
        
        //Se hace referencia a los objetos de la interfaz grafica
        model = tablaRes.getModel(); // el modelo se utiliza para meter la informacion a la tabla
        barra = jProgressBar1; //es la barra de progreso
        btn_iniciar = boton_iniciar; //el boton de iniciar
        btn_parar = boton_parar;//el boton de parar
        tabla = tablaRes;//la tabla
        ej_etiqueta=ejecutando_label;//la etiqueta que indica que proceso se esta ejecutando
        //Metodo que actualiza las columnas y filas de la tabla
        actualizarTablaRes(Simulador.procesos_listos);
        
    }
    
    //Metodo principal
    public static void main(String args[]) {
        //Crea y muestra la interfaz grafica
        new InterfazG().setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        boton_iniciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        criterios = new javax.swing.JComboBox<>();
        jProgressBar1 = new javax.swing.JProgressBar();
        ejecutando_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        boton_parar = new javax.swing.JButton();
        boton_reiniciar = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        boton_iniciar.setText("Iniciar");
        boton_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_iniciarActionPerformed(evt);
            }
        });

        tablaRes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Estado", "T - Requerido", "T - De Ejecucion", "T - De Espera", "T - De Servicio", "Requiere E/S ?", "Prioridad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaRes);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("TABLA DE PROCESOS");

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        criterios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIFO", "SJN", "RR", "HRN" }));
        criterios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criteriosActionPerformed(evt);
            }
        });

        ejecutando_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ejecutando_label.setText("Esperando a iniciar planificacion");

        jLabel3.setText("Seleccione Algoritmo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("SIMULADOR DE ADMINISTRADOR DE PROCESOS");

        boton_parar.setText("Parar");
        boton_parar.setEnabled(false);
        boton_parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_pararActionPerformed(evt);
            }
        });

        boton_reiniciar.setText("Reiniciar");
        boton_reiniciar.setEnabled(false);
        boton_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 563, Short.MAX_VALUE)
                .addComponent(jButton4))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)
                        .addGap(57, 57, 57)
                        .addComponent(criterios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(boton_iniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_parar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_reiniciar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ejecutando_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(criterios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_iniciar)
                    .addComponent(boton_parar)
                    .addComponent(boton_reiniciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ejecutando_label)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //cuando se hace clic en el boton de iniciar
    private void boton_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_iniciarActionPerformed
        
        if(hilo_ejecutando!=null){
            if(hilo_ejecutando.isAlive()){
                hilo_ejecutando.resume();
                Simulador.t.resume();
                boton_iniciar.setEnabled(false);
                boton_parar.setEnabled(true);
                boton_reiniciar.setEnabled(false);
            }
        }else{
            String a=criterios.getSelectedItem().toString();
            //Vacia la tabla
            try {
                for(int i=0; i<30;i++){
                    for(int j=0; j<10;j++){
                        model.setValueAt("", i, j);
                    }
                }
            } catch (Exception e) {
            }
            switch(a){
                case "FIFO":
                    //Se inicia la ejecucion del algoritmo FIFO
                    Simulador.crearProcesosPorDefecto();
                    hilo_ejecutando = new Thread(new AlgoritmoFIFO()); //Crea un nuevo hilo
                    hilo_ejecutando.start();
                    boton_iniciar.setEnabled(false);
                    boton_parar.setEnabled(true);
                    
                break;
                case "SJN":
                    //Se inicia la ejecucion del algoritmo FIFO
                    Simulador.crearProcesosPorDefecto();
                    hilo_ejecutando = new Thread(new AlgoritmoSJN()); //Crea un nuevo hilo
                    hilo_ejecutando.start();
                    boton_iniciar.setEnabled(false);
                    boton_parar.setEnabled(true);
                break;
                case "RR":
                    //Se inicia la ejecucion del algoritmo RR
                    Simulador.crearProcesosPorDefecto();
                    hilo_ejecutando = new Thread(new AlgoritmoRR()); //Crea un nuevo hilo
                    hilo_ejecutando.start();
                    boton_iniciar.setEnabled(false);
                    boton_parar.setEnabled(true);
                break;
		case "HRN":
		  //Se inicia la ejecucion del algoritmo HRN
		  Simulador.crearProcesosPorDefecto();
		  hilo_ejecutando = new Thread(new AlgoritmoHRN());
		  hilo_ejecutando.start();
		  boton_iniciar.setEnabled(false);
		  boton_parar.setEnabled(true);
		break;
            }
        }
    }//GEN-LAST:event_boton_iniciarActionPerformed

    //metodo que java creo, no se esta utilizando
    private void criteriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criteriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_criteriosActionPerformed
    
    //Boton de salir
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //sale del programa
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Cuando se da click al boton de crear proceso
        //Pregunta si desea crar otro programa:
            //opciones disponibles a seleccionar
            String x1="MANUAL";
            //Objeto de opciones
            Object[] options = {x1, "ALEATORIO"};
            //obtener que desea hacer el usuario si crear un proceso de manera aleatorea
            //o que 'el introdusca algunos campos
            int r = JOptionPane.showOptionDialog(null,"¿Desea crear un proceso...?\n",
            " - CREAR PROCESO -",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,x1);
            
            //creamos un objeto random para obtener numeros aleatorios
            Random rd = new Random();
            if (r==JOptionPane.YES_OPTION){
                //Si es manual
                Proceso p = new Proceso(); //se crea un proceso
                p.setPid(Simulador.secuencia_id); //se obtiene el id que sigue para el proceso
                Simulador.secuencia_id++; //se incrementa el contador de id
                p.setNombre(JOptionPane.showInputDialog(null,"Teclea el Nombre del proceso\n")); // se asigna un nombre al proceso
                p.setTiempoRequerido(Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea el Tiempo Requerido del Proceso\n"))); //se asigna el tiempo que el proceso requiere
                //Se genera un numero aleatorio para el recurso a utilizar
                boolean i = rd.nextBoolean();
                //Se asigna que el recurso untilizara que recurso
                p.setRecurso(i);
                //Se introduce el proceso a la lista de procesos creados/listos
                Simulador.introducirProcesoALista(p, Simulador.procesos_listos);
            }
            else {
                //Si es aleatorio
                boolean i = rd.nextBoolean();
                //Se obtiene un numero para el tiempo que el recurso necesita (numero del 2 al 3)
                int j = rd.nextInt(13-2)+1;
                //Se crea el proceso con el id que sigue
                Proceso p = new Proceso(Simulador.secuencia_id, "Proceso "+ Simulador.secuencia_id, j, i);
                //Se incrementa el id
                Simulador.secuencia_id++;
                //se introduce el proceso a la lista
                Simulador.introducirProcesoALista(p, Simulador.procesos_listos);
            }
            actualizarTablaRes(Simulador.procesos_listos);
            
    }//GEN-LAST:event_jButton1ActionPerformed

    //Boton que para el programa (cuando se da clic)
    private void boton_pararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_pararActionPerformed
        // TODO add your handling code here:
        if(hilo_ejecutando.isAlive()){
            //se suspende la ejecucion
            hilo_ejecutando.suspend();
            //se cambian los estados de la interfaz grafica
            boton_iniciar.setText("reanudar"); //se cambia el texto del boton iniciar
            boton_iniciar.setEnabled(true); // se habilita el boton iniciar
            boton_parar.setEnabled(false); //se deshabilita el boton de parar
            boton_reiniciar.setEnabled(true); //se habilita el boton de reiniciar
            //se suspende el creador de procesos
            Simulador.t.suspend();
        }
    }//GEN-LAST:event_boton_pararActionPerformed
    
    //El boton re reiniciar (cuando se da clic)
    private void boton_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reiniciarActionPerformed
        //se detiene la ejecucion del proceso (FIFO,SJN,etc..)
        hilo_ejecutando.stop();
        //se interrumpe al creador de procesos
        Simulador.t.interrupt();
        //Se vacia la lista de procesos listos
        Simulador.procesos_listos = null;
        //Se prepara la lista de procesos y el ambiente de simulacion
        Simulador.inicializar();
        //se pone el porcentaje de la barra de progreso en 
        barra.setValue(0);
        btn_iniciar.setText("Iniciar"); //se cambia el texto del boton iniciar a iniciar
        btn_iniciar.setEnabled(true); //se habilita el boton de iniciar
        boton_parar.setEnabled(false); //se deshabilita el boton de parar
        boton_reiniciar.setEnabled(false); //se deshabilita el boton de reiniciar
        hilo_ejecutando = null; //se pone nulo el hilo que estaba ejecutando el algoritmo
        //Actualiza la tabla con la lista de procesos
        actualizarTablaRes(Simulador.procesos_listos);
        //Se cambia el texto de la etiqueta que muestra que proceso se esta ejecutando
        ejecutando_label.setText("Esperando a iniciar planificacion");
        
        limpiarTabla();
        
    }//GEN-LAST:event_boton_reiniciarActionPerformed
    
    public void limpiarTabla(){
        //se vacia cada renglon y columna de la tabla
        try {
            //i hasta 30 por los renglones que son
            for(int i=0; i<30;i++){
                //menor que 9 porque son 8 columnas
                for(int j=0; j<9;j++){
                    //se rellena la celda con un espacio en blanco
                    model.setValueAt("", i, j);
                }
            }
        } catch (Exception e) {
        }
    }
    //Métodos
    public static void actulizarBarraDeProgreso(int porcentaje){
        //Se actualiza el progreso de la barra
        barra.setValue(porcentaje);
    }
    //actualiza la etiqueta junto a la barra de progreso
    public static void actualizarLabelEjecutando(String contenido){
        ej_etiqueta.setText("Ejecutando Proceso con ID: "+contenido);
    }
    
    //Metodo que se utiliza para actualizar la tabla con las caracteristicas de los procesos
    public static void actualizarTablaRes(Proceso ListaP[]) {
     Simulador.ActualizarTiempoDeServicioDeTodosLosProcesos();
     //Se recorre la lista de procesos
     for (int x=0; x<ListaP.length; x++) {
         //Mientras se encuentre un proceso en la posicion x se rellenara un renglon con su informacion
         //model es un auxiliar para meter la informacion a la tabla
         if(ListaP[x]!=null){
            if(ListaP[x].getEstado()==Proceso.ESTADO_EN_EJECUCION){
                tabla.setRowSelectionInterval(x, x);
            }else{
            }
            //x indica el renglon
            //el numero que le sigue indica la columna
            model.setValueAt(ListaP[x].getPid(), x, 0);
            model.setValueAt(ListaP[x].getNombre(), x, 1);
            //Se obitene el nombre del estado en el que se encuentra el proceso
            model.setValueAt(Proceso.NombreDeEstado(ListaP[x].getEstado()), x, 2);
            model.setValueAt(ListaP[x].getTiempoRequerido(), x, 3);
            model.setValueAt(ListaP[x].getTiempo_de_ejecucion(), x, 4);
            model.setValueAt(ListaP[x].getTiempoDeEspera(), x, 5);
            model.setValueAt(ListaP[x].getTiempo_de_servicio(), x, 6);
            if(ListaP[x].requiereEntradaSalida()){
                model.setValueAt("Si", x, 7);
            }else{
                model.setValueAt("No", x, 7);
            }
            //saca la prioridad del proceso
            model.setValueAt(ListaP[x].getPrioridad(), x, 8);
         }
      } 
    }
    
    //Al terminar el algoritmo se reinicializa la lista de procesos y la barra vuelve a cero
    //se realiza lo mismo que el metodo se llama al hacer click sobre el boton 'terminar'
    public static void algoritmoTerminado(){  
        JOptionPane.showMessageDialog(null,"Procedimiento terminado");
        ej_etiqueta.setText("Esperando a iniciar planificacion");
        Simulador.procesos_listos = null;
        Simulador.inicializar();
        btn_iniciar.setText("Iniciar");
        btn_iniciar.setEnabled(true);
        btn_parar.setEnabled(false);
        hilo_ejecutando = null;
    }
    
    //Variables para la interfaz grafica
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_iniciar;
    private javax.swing.JButton boton_parar;
    private javax.swing.JButton boton_reiniciar;
    private javax.swing.JComboBox<String> criterios;
    private javax.swing.JLabel ejecutando_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaRes;
    // End of variables declaration//GEN-END:variables
}
