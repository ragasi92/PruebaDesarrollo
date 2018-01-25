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
public class Chicago extends Pizza {
    
   public Chicago(){
       String[] ing = {"Salsa de tomate","Pimiento","Salchicha italiana",
           "Queso Mozzarella"};
       setIngredientes(ing);  
       setEstado("En pedido");
   }
   
    
}
