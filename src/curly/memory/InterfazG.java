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
    static TableModel model_jtable;
    
    static JList jlist_listos;
    static JList jlist_bloqueados;
    static JList jlist_ejecucion;
    
    static JList jlist_susp_bloqueados;
    static JList jlist_susp_listos;
    
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
        model_jtable = tablaRes.getModel(); // el modelo se utiliza para meter la informacion a la tabla
        barra = jProgressBar1; //es la barra de progreso
        btn_iniciar = boton_iniciar; //el boton de iniciar
        btn_parar = boton_parar;//el boton de parar
        tabla = tablaRes;//la tabla
        ej_etiqueta=ejecutando_label;//la etiqueta que indica que proceso se esta ejecutando
        
        //Rescatando los modelos de las listas
        jlist_listos = g_lista_listos;
        jlist_bloqueados = g_lista_bloqueados;
        jlist_susp_bloqueados = g_lista_susp_bloqueados;
        jlist_susp_listos = g_lista_susp_listos;
        jlist_ejecucion = g_lista_ejecucion;
        
        //Metodo que actualiza las columnas y filas de la tabla
        actualizarTablaRes();
        
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
        jButton4 = new javax.swing.JButton();
        criterios = new javax.swing.JComboBox<>();
        jProgressBar1 = new javax.swing.JProgressBar();
        ejecutando_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        boton_parar = new javax.swing.JButton();
        boton_reiniciar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        g_lista_listos = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        g_lista_susp_listos = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        g_lista_bloqueados = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        g_lista_ejecucion = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        g_lista_susp_bloqueados = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Crear Proceso");
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
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Estado", "t", "Progreso", "E", "T", "E/S ?", "Prioridad"
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
        if (tablaRes.getColumnModel().getColumnCount() > 0) {
            tablaRes.getColumnModel().getColumn(0).setMinWidth(30);
            tablaRes.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaRes.getColumnModel().getColumn(0).setMaxWidth(30);
            tablaRes.getColumnModel().getColumn(1).setMinWidth(200);
            tablaRes.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaRes.getColumnModel().getColumn(1).setMaxWidth(200);
            tablaRes.getColumnModel().getColumn(2).setMinWidth(170);
            tablaRes.getColumnModel().getColumn(2).setPreferredWidth(170);
            tablaRes.getColumnModel().getColumn(2).setMaxWidth(170);
            tablaRes.getColumnModel().getColumn(3).setMinWidth(30);
            tablaRes.getColumnModel().getColumn(3).setPreferredWidth(30);
            tablaRes.getColumnModel().getColumn(3).setMaxWidth(30);
            tablaRes.getColumnModel().getColumn(4).setMinWidth(70);
            tablaRes.getColumnModel().getColumn(4).setPreferredWidth(70);
            tablaRes.getColumnModel().getColumn(4).setMaxWidth(70);
            tablaRes.getColumnModel().getColumn(5).setMinWidth(30);
            tablaRes.getColumnModel().getColumn(5).setPreferredWidth(30);
            tablaRes.getColumnModel().getColumn(5).setMaxWidth(30);
            tablaRes.getColumnModel().getColumn(6).setMinWidth(30);
            tablaRes.getColumnModel().getColumn(6).setPreferredWidth(30);
            tablaRes.getColumnModel().getColumn(6).setMaxWidth(30);
            tablaRes.getColumnModel().getColumn(7).setMinWidth(40);
            tablaRes.getColumnModel().getColumn(7).setPreferredWidth(40);
            tablaRes.getColumnModel().getColumn(7).setMaxWidth(40);
            tablaRes.getColumnModel().getColumn(8).setMinWidth(70);
            tablaRes.getColumnModel().getColumn(8).setPreferredWidth(70);
            tablaRes.getColumnModel().getColumn(8).setMaxWidth(70);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        g_lista_listos.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(g_lista_listos);

        g_lista_susp_listos.setModel(new DefaultListModel());
        jScrollPane7.setViewportView(g_lista_susp_listos);

        g_lista_bloqueados.setModel(new DefaultListModel());
        jScrollPane8.setViewportView(g_lista_bloqueados);

        g_lista_ejecucion.setModel(new DefaultListModel());
        jScrollPane9.setViewportView(g_lista_ejecucion);

        g_lista_susp_bloqueados.setModel(new DefaultListModel());
        jScrollPane10.setViewportView(g_lista_susp_bloqueados);

        jLabel1.setText("Listos/Preparados");

        jLabel2.setText("Suspendidos Listos");

        jLabel5.setText("Bloqueados");

        jLabel6.setText("Suspendidos Bloqueados");

        jLabel7.setText("Ejecucion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(ejecutando_label)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(criterios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton_iniciar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boton_parar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(boton_reiniciar)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(criterios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(boton_iniciar)
                            .addComponent(boton_parar)
                            .addComponent(boton_reiniciar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ejecutando_label)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
            limpiarTabla();
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

    //Metodo para crear proceso (desde el boton)
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Cuando se da click al boton de crear proceso
        //Pregunta si desea crar otro programa:
            //Objeto de opciones
            Object[] options = {"MANUAL", "ALEATORIO"};
            Object[] si_no = {"SI", "NO"};
            //obtener que desea hacer el usuario si crear un proceso de manera aleatorea
            //o que 'el introdusca algunos campos
            int r = JOptionPane.showOptionDialog(null,"¿Desea crear un proceso...?\n",
            " - CREAR PROCESO -",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,"ALEATORIO");
            //creamos un objeto random para obtener numeros aleatorios
            Random rd = new Random();
            //Variables booleanas para supencion y recursos
            boolean recurso, suspencion;
            int prioridad =0 ,tiempo_requerido=1;
            
            
            if (r==JOptionPane.YES_OPTION){
                //Si es manual
                String nombre = JOptionPane.showInputDialog(null,"Teclea el Nombre del proceso\n");
                tiempo_requerido = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea el Tiempo Requerido del Proceso\n"));
                //Requiere E/S ?
                 r = JOptionPane.showOptionDialog(null,"El proceso utilizara algun recurso?",
            " - CREAR PROCESO -",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,si_no,"NO");
                 recurso = (r==JOptionPane.YES_OPTION);
                 
                //Se suspendera el proceso??
                 r = JOptionPane.showOptionDialog(null,"El proceso se suspendera en la ejecucion?",
            " - CREAR PROCESO -",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,si_no,"NO");
                suspencion = (r==JOptionPane.YES_OPTION);
                
                 //La prioridad del proceso
                 prioridad = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea la prioridad del Proceso\n"));                 
                
                Proceso p = new Proceso(Simulador.secuencia_id, nombre, tiempo_requerido,recurso,suspencion);
                p.setPrioridad(prioridad);
                
                Simulador.secuencia_id++; //se incrementa el contador de id
                
                //Se introduce el proceso a la lista de procesos creados/listos
                Simulador.procesos_listos.agregarProceso(p);
            }
            else {
                //Si es aleatorio
                
                //Valores aleatorios para recurso, suspencion, prioridad
                recurso = rd.nextBoolean();
                suspencion = rd.nextBoolean();
                tiempo_requerido = rd.nextInt(13-2)+1;
                prioridad = rd.nextInt(5-0)+1;
                
                //Se crea el proceso con el id que sigue
                Proceso p = new Proceso(Simulador.secuencia_id, "Proceso "+ Simulador.secuencia_id, tiempo_requerido, recurso,suspencion);
                p.setPrioridad(prioridad);
                //Se incrementa el id
                Simulador.secuencia_id++;
                //se introduce el proceso a la lista
                Simulador.procesos_listos.agregarProceso(p);
            }
            if(hilo_ejecutando==null){
                limpiarTabla();
            }
            actualizarAmbienteGrafico();
            
    }//GEN-LAST:event_jButton1ActionPerformed

    //Boton que para parar el programa (cuando se da clic)
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
        //Se cambia el texto de la etiqueta que muestra que proceso se esta ejecutando
        ejecutando_label.setText("Esperando a iniciar planificacion");
        
        Simulador.procesos_listos.limpiarJlist(jlist_listos);
        Simulador.procesos_bloqueados.limpiarJlist(jlist_bloqueados);
        Simulador.suspendidos_bloqueados.limpiarJlist(jlist_susp_bloqueados);
        Simulador.suspendidos_listos.limpiarJlist(g_lista_susp_listos);
        Simulador.proceso_en_ejecucion.limpiarJlist(jlist_ejecucion);
        
        limpiarTabla();
        Simulador.actualizarDatos();
        
    }//GEN-LAST:event_boton_reiniciarActionPerformed
    
    //Métodos para actualizar interface grafica
    public static void actualizarAmbienteGrafico(){
        actualizarLabelEjecutando();
        actulizarBarraDeProgreso();
        actualizarTablaRes();
        actualizarInterfacePCB();
    }
    
    //Actualizar barra de progreso
    public static void actulizarBarraDeProgreso(){
        Proceso e = Simulador.proceso_en_ejecucion.verPrimerProceso();
        if(e!=null){
            //Se actualiza el progreso de la barra
            barra.setValue(e.getProgreso());
        }else{
            barra.setValue(0);
        }
    }
    
    //actualiza la etiqueta junto a la barra de progreso
    public static void actualizarLabelEjecutando(){
        Proceso e = Simulador.proceso_en_ejecucion.verPrimerProceso();
        if(e!=null){
            ej_etiqueta.setText("Ejecutando Proceso con ID: "+e.getPid());
        }else{
            ej_etiqueta.setText("seleccionando siguiente proceso...");
        }
    }
    
    //Metodo que se utiliza para actualizar la tabla con las caracteristicas de los procesos
    public static void actualizarTablaRes() {
    
    //Se recorre la lista de procesos
     for (int x=0; x<Simulador.todos_los_procesos.length; x++) {
         //Mientras se encuentre un proceso en la posicion x se rellenara un renglon con su informacion
         //model es un auxiliar para meter la informacion a la tabla
         if(Simulador.todos_los_procesos[x]!=null){
            if(Simulador.todos_los_procesos[x].getEstado()==Proceso.ESTADO_EN_EJECUCION){
                tabla.setRowSelectionInterval(x, x);
            }else{
            }
            //x indica el renglon
            //el numero que le sigue indica la columna
            model_jtable.setValueAt(Simulador.todos_los_procesos[x].getPid(), x, 0);
            model_jtable.setValueAt(Simulador.todos_los_procesos[x].getNombre(), x, 1);
            //Se obitene el nombre del estado en el que se encuentra el proceso
            model_jtable.setValueAt(Proceso.NombreDeEstado(Simulador.todos_los_procesos[x].getEstado()), x, 2);
            model_jtable.setValueAt(Simulador.todos_los_procesos[x].getTiempoRequerido(), x, 3);
            model_jtable.setValueAt((Simulador.todos_los_procesos[x].getTiempo_de_ejecucion()*100/Simulador.todos_los_procesos[x].getTiempoRequerido())+"%",x,4);
            model_jtable.setValueAt(Simulador.todos_los_procesos[x].getTiempoDeEspera(), x, 5);
            model_jtable.setValueAt(Simulador.todos_los_procesos[x].getTiempo_de_servicio(), x, 6);
            if(Simulador.todos_los_procesos[x].requiereEntradaSalida()){
                model_jtable.setValueAt("Si", x, 7);
            }else{
                model_jtable.setValueAt("No", x, 7);
            }
            //saca la prioridad del proceso
            model_jtable.setValueAt(Simulador.todos_los_procesos[x].getPrioridad(), x, 8);
         }
      }
     
    }
    
    //Actualizar interface PCB
    public static void actualizarInterfacePCB(){
        Simulador.procesos_listos.imprimirEnJlist(jlist_listos);
        
        Simulador.procesos_bloqueados.imprimirEnJlist(jlist_bloqueados);
        
        Simulador.suspendidos_bloqueados.imprimirEnJlist(jlist_susp_bloqueados);
        
        Simulador.suspendidos_listos.imprimirEnJlist(jlist_susp_listos);
        
        Simulador.proceso_en_ejecucion.imprimirEnJlist(jlist_ejecucion);
    }    
    
    //Al terminar el algoritmo se reinicializa la lista de procesos y la barra vuelve a cero
    //se realiza lo mismo que el metodo se llama al hacer click sobre el boton 'terminar'
    public static void algoritmoTerminado(){  
        ej_etiqueta.setText("Esperando a iniciar planificacion");
        Simulador.procesos_listos = null;
        Simulador.inicializar();
        barra.setValue(100);
        btn_iniciar.setText("Iniciar");
        btn_iniciar.setEnabled(true);
        btn_parar.setEnabled(false);
        hilo_ejecutando = null;
        JOptionPane.showMessageDialog(null,"Procedimiento terminado");
    }
    
    //Metodos auxiliares
    
    //Metodo para limpiar la tabla
    public void limpiarTabla(){
        //se vacia cada renglon y columna de la tabla
        try {
            //i hasta 30 por los renglones que son
            for(int i=0; i<30;i++){
                //menor que 9 porque son 8 columnas
                for(int j=0; j<9;j++){
                    //se rellena la celda con un espacio en blanco
                    model_jtable.setValueAt("", i, j);
                }
            }
        } catch (Exception e) {
        }
    }
    //Variables para la interfaz grafica
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_iniciar;
    private javax.swing.JButton boton_parar;
    private javax.swing.JButton boton_reiniciar;
    private javax.swing.JComboBox<String> criterios;
    private javax.swing.JLabel ejecutando_label;
    private javax.swing.JList<String> g_lista_bloqueados;
    private javax.swing.JList<String> g_lista_ejecucion;
    private javax.swing.JList<String> g_lista_listos;
    private javax.swing.JList<String> g_lista_susp_bloqueados;
    private javax.swing.JList<String> g_lista_susp_listos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tablaRes;
    // End of variables declaration//GEN-END:variables
}
