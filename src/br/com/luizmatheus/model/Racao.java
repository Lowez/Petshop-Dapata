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
public class Racao extends Produtos implements Serializable{
    protected String nome_racao;
    protected double peso;
    protected String qualidade;

    public double getPeso() {
        return peso;
    }

    public String getNome_racao() {
        return nome_racao;
    }

    public void setNome_racao(String nome_racao) {
        this.nome_racao = nome_racao;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getQualidade() {
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }
}
