/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebadedesarrollo;

/**
 *
 * @author ragasi92
 */
public class Clasica extends Pizza{
    public Clasica(){
        String[] ing = {"Salsa de tomate","Pepperoni","Queso"};
       setIngredientes(ing); 
       setEstado("En pedido");
    }
}
