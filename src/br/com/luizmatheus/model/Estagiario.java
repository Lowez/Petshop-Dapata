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
public class Estagiario extends Funcionario implements Serializable{
    protected double bolsa;
    protected int horas_servico;
    protected int cafes_feitos = 0;
    
    public void fazerCafe() {
        System.out.println("+1 café");
        cafes_feitos++;
    }
    
    public void sofrer() {
        System.out.println("Meu Deus...meu Senhor..me ajuda, pór favor");
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public int getHoras_servico() {
        return horas_servico;
    }

    public void setHoras_servico(int horas_servico) {
        this.horas_servico = horas_servico;
    }
}
