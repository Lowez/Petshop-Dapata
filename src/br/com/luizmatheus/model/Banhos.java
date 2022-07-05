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
public class Banhos extends Servicos{
    private String tipoShampoo;
    private int nivelDeLimpeza;
    
    public void passarShampoo(){
        System.out.println("Passando shampoo...");
        setNivelDeLimpeza(1);
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
