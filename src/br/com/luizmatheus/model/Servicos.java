/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luizmatheus.model;

import java.io.Serializable;

/**
 *
 * @author Computação
 */
public abstract class Servicos implements Serializable{
    protected double custo;
    protected String dataAgendada;
    
    private int lucro = 15;
    
    public void calcularPrecoDeVenda() {
        System.out.println("Total: " + custo+lucro);
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(String dataAgendada) {
        this.dataAgendada = dataAgendada;
    }
}
