/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luizmatheus.model;

/**
 *
 * @author Computação
 */
public class Roupas extends Produtos{
    private char tamanho;
    private String cor;
    private int nivelDeCalorGerado;

    public void esquentar() {
        setNivelDeCalorGerado(getNivelDeCalorGerado() + 1);
    }

    public Roupas() {
        setNivelDeCalorGerado(0);
    }
    
    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
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
