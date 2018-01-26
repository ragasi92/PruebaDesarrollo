/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * 
 * @author ragasi92
 */
public class Chicago extends Pizza {
    
    /**
     * <p>
     * Recibe el nombre del cliente del pedido
     * </p>
     *
     * @param cliente
     * 
     */
    public Chicago(String cliente){
       String[] ing = {"Salsa de tomate","Pimiento","Salchicha italiana",
           "Queso Mozzarella"};
       setIngredientes(ing);  
       setCliente(cliente);
       setTipo("Chicago");
   }
   
    
}
