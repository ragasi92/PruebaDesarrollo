/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Chicago;
import Modelo.Clasica;
import Modelo.Hawaii;
import Modelo.Mexicana;
import Modelo.Pizza;
import Vista.jfMain;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author ragasi92
 */
public class ControladorMainFrame implements ActionListener {
    
    jfMain ventana;
    //variable para el numero de pizzas
    private int canPizza = 1;
    //modelo de la tabla
    private DefaultTableModel modelo;
    private TableColumnModel modCol;
    //identificadores de la tabla de pedidos
    private final String[] nombresTabla = {"Cliente","Pizza","Estado"};
    private final String[] nombresTabla2 = {"Cliente","Pizza","Ingredientes","Estado"};
    
    //private ArrayList<Pizza> pedidos = new ArrayList<>();
    private LinkedList<Pizza> pedidos = new LinkedList<>();
    
    public ControladorMainFrame(jfMain ventana){
        this.iniciar(ventana);
        
    }
    private void iniciar(jfMain vnt){
        this.ventana = vnt;
        //Se establece el tamaño de la ventana
        ventana.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, 
                Toolkit.getDefaultToolkit().getScreenSize().width);
        //Numero inicial de pizzas
        ventana.txtNumPizzas.setText(String.valueOf(canPizza));
        //Se inicializa el modelo de la tabla de pedidos
        modelo = (DefaultTableModel)ventana.tblPedidos.getModel();
        //Identificadores de las columnas de la tabla
        modelo.setColumnIdentifiers(nombresTabla2);
        //Se establecen los tamaños de las columnas
        this.modCol = (TableColumnModel)ventana.tblPedidos.getColumnModel();
        modCol.getColumn(0).setPreferredWidth(150);//tamaño columna cliente
        modCol.getColumn(1).setPreferredWidth(150);//tamaño columna Tipo de pizza
        modCol.getColumn(2).setPreferredWidth(450);//tamaño columna ingredientes
        modCol.getColumn(3).setPreferredWidth(200);//tamaño columna estado
        //Se inicia con la tabla vacia
        modelo.setRowCount(0);
        //Se asigna el focus al jtextFiel del cliente
        ventana.txtNombre.grabFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.ventana.btnMnP==e.getSource()){
             this.actionBtnMnP();
            
        }else if(this.ventana.btnMxP == e.getSource()){
            this.actionBtnMxP();
            
        }else if(this.ventana.bntAgregar==e.getSource()){
            this.actionAgregarBtn();
            
        }else if(this.ventana.btnFinPedido==e.getSource()){
            this.actionFinalizarPedido();
            
        }
    }//Fin del actionPerormed
    
    /*
     *Funcion del boton "-"
     * cada vez que se precione el boton se restará uno 
     * a la cantidad de pizza
    */
    private void actionBtnMnP(){
        canPizza -= 1;
            if(canPizza <=0)
                canPizza =1;
            this.ventana.txtNumPizzas.setText(String.valueOf(canPizza));
    }//fin del metodo
    /*
     *Función del botón "+", cada vez que se presione se sumará uno
     * a la cantidad de pizzas para el pedido
    */
    private void actionBtnMxP(){
        canPizza += 1;
        if(canPizza >=20)
            canPizza =20;
        this.ventana.txtNumPizzas.setText(String.valueOf(canPizza));
    }
    
    private void actionAgregarBtn(){
        //Al presionar el boton agregar se mantiene el nombre del cliente
        //las pizzas se van agregando a la lista de pedidos

        //Se guarda el tipo de pizza del comboBox
        String tpizza = this.ventana.cbTipoPizza.getSelectedItem().toString();
        //Se guarda el nombre del cliente
        String cliente = this.ventana.txtNombre.getText();
        //Si no se escribio el nombre del cliente muestra un mensaje 
        if(cliente.isEmpty()){
            ventana.lblMensaje.setText("Favor de ingresar un nombre.");
            ventana.lblMensaje.setVisible(true);
        }
        //Si se incluye el nombre del cliente se ejecuta el pedido
        else{
            //Se manda llamar la funcion del pedido
            pedidoPizza(cliente, tpizza, canPizza);
            //Se inicializan los elementos del jFrame
            ventana.lblMensaje.setVisible(false);
            canPizza = 1;
            ventana.txtNumPizzas.setText(String.valueOf(canPizza));
        
        }//fin del else
    }//fin del metodo actionAgregar
    
    private void actionFinalizarPedido(){
        //Al presionar el botón "Finalizar pedido" se borra el nombre del cliente
        //no se agregan pizzas a la lista de pedidos
        ventana.txtNombre.setText("");
        ventana.txtNombre.grabFocus();
    }
    
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
        }//fin del switch
        
        //se actualiza la tabla
        mostrarTabla();
    }//fin del método
    
    private String ingredientes(String[] ing){
        //Recorre el arreglo con los ingredientes de la pizza
        String ingredientes ="";
        int tam = ing.length;
        for(int i =0;i<tam;i++){
            if(i==tam-1){
               ingredientes =ingredientes.concat(ing[i]); 
            }else{
                ingredientes =ingredientes.concat(ing[i]);
                ingredientes =ingredientes.concat(", ");  
            }
            
        }//fin del for
        //Se concatena cada uno de los Strings de los ingredientes
        //a un nuevo String y se regresa el String creado
        return ingredientes;
    }//Fin del metodo
    
    public void pedidosEntregados(){
        //Metodo para eliminar los pedidos entregados 
        for(int i =0;i<pedidos.size();i++){
            if(pedidos.get(i).getEstado()=="Entregado al cliente")
                pedidos.remove(i);
        }//fin del for
    }//Fin del metodo
    
    private  void mostrarTabla(){
        //Se limpian los elementos de la tabla
        limpiarTabla();
        //se recorre la lista de pedidos 
        for(int i =0;i<pedidos.size();i++){
            
               //Si el estado del pedido es en armado se muestran los ingredientes
            if(pedidos.get(i).getEstado()=="En armado"){
                //Se crea un arreglo de Strings con los valores del pedido
                String[] s = {
                pedidos.get(i).getCliente(),
                pedidos.get(i).getTipo(),
                ingredientes(pedidos.get(i).getIngredientes()),
                pedidos.get(i).getEstado()
                };
                //Se agrega el pedido a la tabla
                modelo.addRow(s);
            }//Fin del if
            //Si no hay pedido en armado no se muestran los ingredientes
            else{
                //Se crea un arreglo de String con los valores del pedido
               String[] s = {
                pedidos.get(i).getCliente(),
                pedidos.get(i).getTipo(),"",
                pedidos.get(i).getEstado()
                }; 
               //Se agrega el pedido a la tabla
               modelo.addRow(s);
            }//Fin del else             
        }//Fin del for
    }//Fin del metodo mostrar tabla
    
    private void limpiarTabla(){
        //Limpia los elementos de la tabla para actualizar la tabla
        for (int i = 0; i < ventana.tblPedidos.getRowCount(); i++) {
            modelo.removeRow(i);
            i-=1;
        }//Fin del for
    }//Fin del metodo
    
    /**
     *
     */
    public void estados(){
        //Funcion para cambiar los estados de forma automática
        
        //Se crea un iterador para recorrer la lista de pedidos
        Iterator iter = pedidos.iterator();
        //se crea un objeto de tipo Pizza
        Pizza iP;
        //Se recorre la lista
        while(iter.hasNext()){
            //Se pasa el elemento actual de la lista a el objeto creado
            iP = (Pizza)iter.next();
            //Se obtiene el estado del elemento
            switch(iP.getEstado()){
                //case para cambiar el estado
                case "En pedido":
                    iP.setEstado("En armado");
                    break;
                case "En armado":
                    iP.setEstado("En horno");
                    break;
                case "En horno":
                    iP.setEstado("En empacado");
                    break;
                case "En empacado":
                    iP.setEstado("Entregado al cliente");
                    break;
                    
            }//Fin del switch 
        }//Fin del while
        //Se muestra la tabla con los datos actualizados
        mostrarTabla();
    }//Fin del metodo
    
    
    
                // Se ejecuta la tarea cada 8s

    
}//Fin de la clase
