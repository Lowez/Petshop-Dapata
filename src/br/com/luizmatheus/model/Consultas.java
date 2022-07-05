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
public class Consultas extends Servicos{
    private String nomeVeterinarioResponsavel;
    private int nivelDeSaude;

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
