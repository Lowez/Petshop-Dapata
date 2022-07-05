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
public class Banho extends Servicos implements Serializable{
    protected String tipoShampoo;
    protected int nivelDeLimpeza;
    protected String nomeEstagiario;
    protected String tipo_animal;
    protected String nome_animal;
    
    public void passarShampoo(){
        System.out.println("Passando shampoo...");
        setNivelDeLimpeza(1);
    }

    public String getNomeEstagiario() {
        return nomeEstagiario;
    }

    public void setNomeEstagiario(String nomeEstagiario) {
        this.nomeEstagiario = nomeEstagiario;
    }

    public String getTipo_animal() {
        return tipo_animal;
    }

    public void setTipo_animal(String tipo_animal) {
        this.tipo_animal = tipo_animal;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }
    
    public void enxaguar() {
        if (getNivelDeLimpeza() == 1) {
            System.out.println("Enxaguando...");
        } else {
            System.out.println("Passe shampoo antes");
            setNivelDeLimpeza(2);
        }
    }

    public String getTipoShampoo() {
        return tipoShampoo;
    }

    public void setTipoShampoo(String tipoShampoo) {
        this.tipoShampoo = tipoShampoo;
    }

    public int getNivelDeLimpeza() {
        return nivelDeLimpeza;
    }

    public void setNivelDeLimpeza(int nivelDeLimpeza) {
        this.nivelDeLimpeza = nivelDeLimpeza;
    }
    
}
