/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador.memoria;

import curly.memory.Proceso;

import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author HDEZ. OCHOA D. SEBASTIAN
 */
public class InterfazG extends javax.swing.JFrame {
    /**
     * Creates new form InterfazG
     */
    //Variables que permiten a las clases de Simulador, FIFO, SJN, etc.. puedan acceder y modificar
    //la interfaz grafica
    TableModel model_jtable;
    TableModel model_jtable_memreal;
    TableModel model_jtable_memvirt;
    
    public static Proceso procesos[];
    
    //Se declara una variable que contendra al algoritmo (FIFO, SJN) que se esta ejecutando
    static int secuencia_id=1;
    
    //Objetos para representar la memoria
    Solt memoria_fisica;
    Solt memoria_virtual;
    
    public InterfazG() {
      initComponents();
      procesos= new Proceso[30];
       
      memoria_fisica = new Solt(1024);
      memoria_virtual= new Solt(1024);
    
      setCellRender(jTable1);
      setCellRender(jTable2);
      
      model_jtable = jTable3.getModel();
      
      model_jtable_memreal = jTable1.getModel();
      model_jtable_memvirt = jTable2.getModel();
      
      
    }
    
    //Metodo para pintar las celdas
    public void setCellRender(JTable table) {
        Enumeration<TableColumn> en = table.getColumnModel().getColumns();
        while (en.hasMoreElements()) {
            TableColumn tc = en.nextElement();
            tc.setCellRenderer(new CellRenderer());
        }
    }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "MB Ocupados", "Proceso", "P"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setMinWidth(20);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(20);
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "MB Ocupados", "Proceso", "P"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(2).setMinWidth(20);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(20);
        }

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "PID", "Memoria", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMinWidth(50);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable3.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
        }

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextPane1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jTextPane1.setText("ADMINISTRADOR DE MEMORIA");
        jScrollPane4.setViewportView(jTextPane1);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Procesos");

        jLabel2.setText("Memoria Virtual");

        jLabel3.setText("Memoria Real");

        jButton2.setText("Agregar Proceso");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel3)
                .addGap(203, 203, 203)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTÓN DE SALIR
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BOTON AGREGAR PROCESO
        Object[] si_no = {"SI", "NO"};
        
        //String nombre = JOptionPane.showInputDialog(null,"Teclea el Nombre del proceso\n");
        
        Proceso nuevo_proceso = new Proceso(secuencia_id, "Proceso "+secuencia_id);
        introducirProcesoALista(nuevo_proceso);
        
        secuencia_id++; //se incrementa el contador de id
        
        ColocarProcesoEnMemoria(nuevo_proceso);
        
        actualizarTablaRes();
            
        actualizarTablaMemoria(memoria_fisica, model_jtable_memreal);
        
        actualizarTablaMemoria(memoria_virtual, model_jtable_memvirt);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        
        int r = jTable3.getSelectedRow();        
        
        if(procesos[r]!=null){
            liberarProcesoDeMemoria(memoria_fisica,procesos[r]);
            liberarProcesoDeMemoria(memoria_virtual,procesos[r]);
            procesos[r] = null;
            for(int i=0; i<procesos.length;i++){
                if(procesos[i]==null&&i+1<procesos.length){
                    if(procesos[i+1]!=null){
                        procesos[i] = procesos[i+1];
                        procesos[i+1] = null;   
                    }
                }
            }
        }        
        
        actualizarTablaRes();
            
        actualizarTablaMemoria(memoria_fisica, model_jtable_memreal);
        
        actualizarTablaMemoria(memoria_virtual, model_jtable_memvirt);
        
    }//GEN-LAST:event_jTable3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazG().setVisible(true);
            }
        });
    }
    
    //Metodo para limpiar la tabla
    public static void limpiarTabla(TableModel model){
        //se vacia cada renglon y columna de la tabla
        try {
            //i hasta 30 por los renglones que son
            for(int i=0; i<30;i++){
                //menor que 9 porque son 8 columnas
                for(int j=0; j<3;j++){
                    //se rellena la celda con un espacio en blanco
                    model.setValueAt("", i, j);
                }
            }
        } catch (Exception e) {
            
        }
    }
    
    public void actualizarTablaRes() {
     limpiarTabla(model_jtable);
     //Se recorre la lista de procesos
     for (int x=0; x<procesos.length; x++) {
         //Mientras se encuentre un proceso en la posicion x se rellenara un renglon con su informacion
         //model es un auxiliar para meter la informacion a la tabla
         if(procesos[x]!=null){
            //x indica el renglon
            //el numero que le sigue indica la columna
            model_jtable.setValueAt(procesos[x].getPid(), x, 0);
            model_jtable.setValueAt(procesos[x].getMemoria(), x, 1);
            model_jtable.setValueAt(procesos[x].getNombre(), x, 2);
         }
      }
     
    }
    
    public void actualizarTablaMemoria(Solt memoria, TableModel modelo) {
        limpiarTabla(modelo);
        
        for(int i = 0; i<memoria.paginas.length;i++){
            modelo.setValueAt(memoria.paginas[i].getEspacio_ocupado(), i, 0);
            
            Proceso proceso_en_pagina = memoria.paginas[i].getProceso();
            
            if(proceso_en_pagina!=null){
                modelo.setValueAt(proceso_en_pagina.getNombre(), i, 1);
            }else{
                modelo.setValueAt(" disponible ", i, 1);
            }
        }
        
    }
    
    //Metodo para meter un proceso a la lista de todos los procesos
    public static void introducirProcesoALista(Proceso p){
        //Recorremos la lista
        for(int i =0; i<procesos.length;i++){
            //Si encontramos una posicion vacia
            if(procesos[i]==null){
                //guardamos el proceso en esa posicion
                procesos[i] = p;
                //rompemos el ciclo
                break;
            }
        }
    }
    
    
    public void reordenarLista(Proceso lista[]){
        for(int i=0; i<lista.length;i++){
            if(lista[i]==null&&i+1<lista.length){
                if(lista[i+1]!=null){
                  lista[i] = lista[i+1];
                  lista[i+1] = null;   
                }
            }
        }
    }
    
    //Metodo para meter un proceso a la lista de todos los procesos
    public static void eliminarProcesoDeLista(Proceso p){
        //Recorremos la lista
        for(int i =0; i<procesos.length;i++){
            //Si encontramos una posicion vacia
            if(procesos[i]==p){
                //guardamos el proceso en esa posicion
                procesos[i] = null;
                //rompemos el ciclo
                break;
            }
        }
    }
    
    public void liberarProcesoDeMemoria(Solt memoria, Proceso p) {
        for(int j = 0; j<memoria.paginas.length;j++){
            Proceso pg = memoria.paginas[j].getProceso();
            if(pg!=null){
                if(pg.getPid()==p.getPid()){
                    memoria.paginas[j].setProceso(null);
                    memoria.paginas[j].setEspacio_disponible(64);
                    memoria.paginas[j].setEspacio_ocupado(0);
                    memoria.paginas[j].setEstado(true);
                }
            }
        }
        traspasarProcesos();
    }
        
    public void ColocarProcesoEnMemoria(Proceso p){
        
        int paginas_asignadas=0;
        System.out.println("* = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println(p.getNombre()+" requiere "+p.getMemoria()+ "MB");
        int numero_paginas = (int) Math.ceil( (float) p.getMemoria() / (float) 64 );
        System.out.println(p.getNombre()+" requiere "+numero_paginas+ " frames");
        int residuo;
        if(p.getMemoria()>=64){
            residuo = p.getMemoria()%64;
        }else{
            residuo = 64-p.getMemoria();
        }
        System.out.println("La ultima pagina de este proceso tendra una fragmentacion interna de "+residuo+ "MB");
        
        
        if(paginas_asignadas<numero_paginas){

                 System.out.println("Asignando en memoria real");
                 System.out.println("Espacio ocupado en memoria real"+ memoria_fisica.calcularEspacioOcupado()+"/"+memoria_fisica.getTamanio());

                 for(int j=0; j<memoria_fisica.paginas.length;j++){
                     if(paginas_asignadas < numero_paginas ){
                         System.out.print("checando pagina "+j+" ");
                         if(memoria_fisica.paginas[j].estaDisponible()){
                             if(numero_paginas==1||numero_paginas==paginas_asignadas){
                                 memoria_fisica.paginas[j].setEspacio_ocupado((64-residuo));
                                 memoria_fisica.paginas[j].setEspacio_disponible(residuo);
                             }else{
                                 memoria_fisica.paginas[j].setEspacio_ocupado(64);
                                 memoria_fisica.paginas[j].setEspacio_disponible(0);
                             }
                             memoria_fisica.paginas[j].setProceso(p);
                             memoria_fisica.paginas[j].setEstado(false);
                             paginas_asignadas++;
                             System.out.println(" <-- (asignada) " );
                         }else{
                             System.out.println(" <-- (ya ocupada) " );
                         }
                     }
                 }
                System.out.println("Espacio ocupado en memoria real"+ memoria_fisica.calcularEspacioOcupado()+"/"+memoria_fisica.getTamanio());
        }
        
        if(paginas_asignadas<numero_paginas){

                System.out.println("Asignando en memoria real");
                System.out.println("Espacio ocupado en memoria real"+ memoria_virtual.calcularEspacioOcupado()+"/"+memoria_virtual.getTamanio());

                for(int j=0; j<memoria_virtual.paginas.length;j++){
                    if(paginas_asignadas < numero_paginas ){
                        System.out.print("checando pagina "+j+" ");
                        if(memoria_virtual.paginas[j].estaDisponible()){
                            if(numero_paginas==1||numero_paginas==paginas_asignadas){
                                 memoria_virtual.paginas[j].setEspacio_ocupado((64-residuo));
                                 memoria_virtual.paginas[j].setEspacio_disponible(residuo);
                            }else{
                                 memoria_virtual.paginas[j].setEspacio_ocupado(64);
                                 memoria_virtual.paginas[j].setEspacio_disponible(0);
                            }
                             memoria_virtual.paginas[j].setProceso(p);
                             memoria_virtual.paginas[j].setEstado(false);
                             paginas_asignadas++;
                             System.out.println(" <-- (asignada) " );
                        }else{
                             System.out.println(" <-- (ya ocupada) " );
                        }
                    }
                }     
            System.out.println("Espacio ocupado en memoria real"+ memoria_virtual.calcularEspacioOcupado()+"/"+memoria_virtual.getTamanio());
        }
        
        if(paginas_asignadas<numero_paginas){
            liberarProcesoDeMemoria(memoria_fisica,p);
            liberarProcesoDeMemoria(memoria_virtual,p);
            eliminarProcesoDeLista(p);
            actualizarTablaRes();
            JOptionPane.showMessageDialog(null,"Ya no hay espacio para alojar el siguiente proceso");
        }
        actualizarTablaRes();
    }
    
    
    public void traspasarProcesos(){
        Proceso p = null;
        for(Pagina pagina_virtual : memoria_virtual.paginas){
            
            if(!pagina_virtual.estaDisponible()){
                
                p = pagina_virtual.getProceso();
                
                for(Pagina pagina_real : memoria_fisica.paginas){
                    if(memoria_fisica.estaDisponible()){
                        if(pagina_real.estaDisponible() && pagina_virtual.getProceso()==p){
                            pagina_real.setEstado(false);
                            pagina_real.setProceso(p);
                            pagina_real.setEspacio_disponible(pagina_virtual.getEspacio_disponible());
                            pagina_real.setEspacio_ocupado(pagina_virtual.getEspacio_ocupado());
                            pagina_virtual.setEstado(true);
                            pagina_virtual.setProceso(null);
                            pagina_virtual.setEspacio_disponible(64);
                            pagina_virtual.setEspacio_ocupado(0);                                
                        } 
                    }else{
                        break;
                    }
                }

            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

}
