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
public class Consulta extends Servicos implements Serializable{
    private String nomeVeterinarioResponsavel;
    private int nivelDeSaude;
    private String tipo_animal;
    private String nome_animal;

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

    public void medicar() {
        setNivelDeSaude(1);
        System.out.println("Medicando");
    }
    
    public void darAlta() {
        if (getNivelDeSaude() == 1) {
            System.out.println("Alta!");
        } else {
            System.out.println("Cura o bicho primeiro");
        }
    }
    
    public String getNomeVeterinarioResponsavel() {
        return nomeVeterinarioResponsavel;
    }

    public void setNomeVeterinarioResponsavel(String nomeVeterinarioResponsavel) {
        this.nomeVeterinarioResponsavel = nomeVeterinarioResponsavel;
    }

    public int getNivelDeSaude() {
        return nivelDeSaude;
    }

    public void setNivelDeSaude(int nivelDeSaude) {
        this.nivelDeSaude = nivelDeSaude;
    }
    
}
