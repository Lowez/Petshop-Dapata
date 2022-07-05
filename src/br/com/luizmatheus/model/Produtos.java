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
public abstract class Produtos implements Serializable{
    protected double precoDeVenda;
    protected double custo;
    protected String fornecedor;

    public void vender() {
        System.out.println("Vendendo...");
    }
    
    public void comprar() {
        System.out.println("Comprado");
    }
    
    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
}
