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
public class PruebaDeDesarrollo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] s = {"hola","jamon"};
        Chicago chic = new Chicago();
        System.out.println(chic.getEstado());
        chic.setEstado("En armado");
        System.out.println(chic.getEstado()+ ":");
        for(int i  = 0;i<chic.getIngredientes().length;i++)
          System.out.println(chic.getIngredientes()[i]);
    }
    
}
