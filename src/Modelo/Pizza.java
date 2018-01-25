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
public class Pizza {
    
    private String[] ingredientes;
    private String estado;
    

    /**
     * @return the ingredientes
     */
    public String[] getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public final void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
