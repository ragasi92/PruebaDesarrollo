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
public class Clasica extends Pizza{
    public Clasica(String cliente){
        String[] ing = {"Salsa de tomate","Pepperoni","Queso"};
       setIngredientes(ing);
       setCliente(cliente);
       setTipo("Clasica");
    }
}
