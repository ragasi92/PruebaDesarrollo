/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author ragasi92
 */
public class Pizza {
    
    private String[] ingredientes;
    private String tipo;
    private String estado = "En pedido";
    private String cliente;
    

    /**
     * @return the ingredientes
     */
    public String[] getIngredientes() {
        return ingredientes;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
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

    /**
     * @return the cliente
     */
    public final String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public final void setCliente(String cliente) {
        this.cliente = cliente;
    }
}


