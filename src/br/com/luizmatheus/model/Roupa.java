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
public class Roupa extends Produtos implements Serializable{
    protected String tamanho;
    protected String cor;
    protected int nivelDeCalorGerado;

    public void esquentar() {
        setNivelDeCalorGerado(getNivelDeCalorGerado() + 1);
    }

    public Roupa() {
        setNivelDeCalorGerado(0);
    }
    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNivelDeCalorGerado() {
        return nivelDeCalorGerado;
    }

    public void setNivelDeCalorGerado(int nivelDeCalorGerado) {
        this.nivelDeCalorGerado = nivelDeCalorGerado;
    }
    
}
