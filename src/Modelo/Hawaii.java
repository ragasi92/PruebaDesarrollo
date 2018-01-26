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
public class Hawaii extends Pizza{

    /**
     *Recibe el nombre del cliente
     * @param cliente
     */
    public Hawaii(String cliente){
        String[] ing = {"Piña","Jamón","Queso","Salchicha"};
       setIngredientes(ing); 
       setCliente(cliente);
       setTipo("Hawaii");
    }
    
}
