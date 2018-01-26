/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Chicago;
import Modelo.Clasica;
import Modelo.Hawaii;
import Modelo.Mexicana;
import Modelo.Pizza;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ragasi92
 */
public class jfMain extends javax.swing.JFrame {
    //variable para el numero de pizzas
    private int canPizza = 1;
    //modelo de la tabla
    private final DefaultTableModel modelo;
    //identificadores de la tabla de pedidos
    private final String[] nombresTabla = {"Cliente","Pizza","Estado"};
    private final String[] nombresTabla2 = {"Cliente","Pizza","Ingredientes","Estado"};
    
    ArrayList<Pizza> pedidos = new ArrayList<>();
    /**
     * Creates new form jfMain
     */
    public jfMain() {
        initComponents();
        //Se establece el tamaño de la ventana
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, 
                Toolkit.getDefaultToolkit().getScreenSize().width);
        //Numero inicial de pizzas
        this.txtNumPizzas.setText(String.valueOf(canPizza));
        //Se inicializa el modelo de la tabla de pedidos
        modelo = (DefaultTableModel)this.tblPedidos.getModel();
        //Identificadores de las columnas de la tabla
        modelo.setColumnIdentifiers(nombresTabla2);
        //Se inicia con la tabla vacia
        modelo.setRowCount(0);
        //Se asigna el focus al jtextFiel del cliente
        this.txtNombre.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbTipoPizza = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnMnP = new javax.swing.JButton();
        btnMxP = new javax.swing.JButton();
        bntPedido = new javax.swing.JButton();
        txtNumPizzas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        lblMensaje = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingresa tu nombre:");

        jLabel2.setText("Selecciona el tipo de pizza:");

        cbTipoPizza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chicago","Mexicana","Hawaii","Clasica" }));

        jLabel3.setText("Cantidad: ");

        btnMnP.setText("-");
        btnMnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMnPActionPerformed(evt);
            }
        });

        btnMxP.setText("+");
        btnMxP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMxPActionPerformed(evt);
            }
        });

        bntPedido.setText("Realizar Pedido");
        bntPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPedidoActionPerformed(evt);
            }
        });

        txtNumPizzas.setText("jLabel4");

        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPedidos.setName("efdsa"); // NOI18N
        jScrollPane1.setViewportView(tblPedidos);

        jLabel4.setText("PEDIDOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(txtNumPizzas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bntPedido)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbTipoPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnMnP)
                                    .addGap(40, 40, 40)
                                    .addComponent(btnMxP)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 125, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbTipoPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnMnP)
                            .addComponent(btnMxP)
                            .addComponent(txtNumPizzas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntPedido)
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMnPActionPerformed
        canPizza -= 1;
        if(canPizza <=0)
            canPizza =1;
        this.txtNumPizzas.setText(String.valueOf(canPizza));
    }//GEN-LAST:event_btnMnPActionPerformed

    private void btnMxPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMxPActionPerformed
        canPizza += 1;
        if(canPizza >=20)
            canPizza =20;
        this.txtNumPizzas.setText(String.valueOf(canPizza));
    }//GEN-LAST:event_btnMxPActionPerformed

    private void bntPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPedidoActionPerformed
        //Se guarda el tipo de pizza del comboBox
        String tpizza = this.cbTipoPizza.getSelectedItem().toString();
        //Se guarda el nombre del cliente
        String cliente = this.txtNombre.getText();
        //Si no se escribio el nombre del cliente muestra un mensaje 
        if(cliente.isEmpty()){
            this.lblMensaje.setText("Favor de ingresar un nombre.");
            lblMensaje.setVisible(true);
        }
        //Si se incluye el nombre del cliente se ejecuta el pedido
        else{
            //Se manda llamar la funcion del pedido
            pedidoPizza(cliente, tpizza, canPizza);
            
            //Se inicializan los elementos del jFrame
            this.txtNombre.setText("");
            this.txtNombre.grabFocus();
            this.lblMensaje.setVisible(false);
            canPizza = 1;
            this.txtNumPizzas.setText(String.valueOf(canPizza));
        
        }
        
    }//GEN-LAST:event_bntPedidoActionPerformed

    private void pedidoPizza(String cliente,String tipo, int cantidad){
        //Dependiendo del tipo de pizza se crean n objetos y se 
        //agregan a la cola de pedidos
        //Cada objeto recibe el nombre del cliente
        switch(tipo){
            case "Chicago":
                for(int i =1;i<=cantidad;i++){
                    pedidos.add(new Chicago(cliente));
                }
                break;
            case "Mexicana":
                for(int i =1;i<=cantidad;i++){
                    pedidos.add(new Mexicana(cliente));
                }
                break;
            case "Hawaii":
                for(int i =1;i<=cantidad;i++){
                    pedidos.add(new Hawaii(cliente));
                }
                break;
            case "Clasica":
                for(int i =1;i<=cantidad;i++){
                    pedidos.add(new Clasica(cliente));
                }
                break;
        }
        mostrarTabla();
        
    }
    private String ingredientes(String[] ing){
        //Recorre el arreglo con los ingredientes de la pizza
        String ingredientes ="";
        int tam = ing.length;
        for(int i =0;i<tam;i++){
            ingredientes =ingredientes.concat(ing[i]);
            ingredientes =ingredientes.concat("\n");
        }
        //Se concatena cada uno de los Strings de los ingredientes
        //a un nuevo String y se regresa el String creado
        return ingredientes;
    }
    
    private void mostrarTabla(){
        //Se borran los elementos de la tabla
        modelo.setRowCount(0);
        //se recorre la lista de pedidos 
        for(int i =0;i<pedidos.size();i++){
            //Si el estado del pedido es en armado se muestran los ingredientes
            if(pedidos.get(i).getEstado()=="En armado"){
                //Se cambian los nombres de las columnas
                this.modelo.setColumnIdentifiers(nombresTabla2);
                //Se crea un arreglo de Strings con los valores del pedido
                String[] s = {
                pedidos.get(i).getCliente(),
                pedidos.get(i).getTipo(),
                ingredientes(pedidos.get(i).getIngredientes()),
                pedidos.get(i).getEstado()
                };
                //Se agrega el pedido a la tabla
                modelo.addRow(s);
            }
            //Si no hay pedido en armado no se muestran los ingredientes
            else{
                //Se cambian los nombres de las columnas
                modelo.setColumnIdentifiers(nombresTabla);
                //Se crea un arreglo de String con los valores del pedido
               String[] s = {
                pedidos.get(i).getCliente(),
                pedidos.get(i).getTipo(),
                pedidos.get(i).getEstado()
                }; 
               //Se agrega el pedido a la tabla
               modelo.addRow(s);
            }
            
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(jfMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               jfMain ventana = new jfMain();
               ventana.setVisible(true);
                Timer timer;
                timer = new Timer();

    TimerTask task = new TimerTask() {
        int tic=0;

        @Override
        public void run()
        {
            
            if (tic%2==0)
            System.out.println("TIC");
            else
            System.out.println("TOC");
            tic++;
        }
        };
        // Empezamos dentro de 10ms y luego lanzamos la tarea cada 1000ms
    timer.schedule(task, 10, 1000);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntPedido;
    private javax.swing.JButton btnMnP;
    private javax.swing.JButton btnMxP;
    private javax.swing.JComboBox<String> cbTipoPizza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTable tblPedidos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtNumPizzas;
    // End of variables declaration//GEN-END:variables
}
