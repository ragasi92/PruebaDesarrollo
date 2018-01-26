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
public class Mexicana extends Pizza{

    /**
     *
     * @param cliente
     */
    public Mexicana(String cliente){
        String[] ing = {"Carne molida","Chile jalapeño","Cebolla",
           "Queso oaxaca","Aguacate"};
       setIngredientes(ing);
       setCliente(cliente);
       setTipo("Mexicana");
    }
    
}
