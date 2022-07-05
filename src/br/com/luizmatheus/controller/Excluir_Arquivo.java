/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luizmatheus.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author Computação
 */
public class Excluir_Arquivo {
    
    public void excluir(String nome_arq){
        //deletar
        try
        {
            final Path p = Paths.get(nome_arq + ".txt");
            if (Files.deleteIfExists(p))
            {
                JOptionPane.showMessageDialog(null, "Excluido " + p);
            }
            else
            {
                JOptionPane.showMessageDialog(null, p + " não existe.");
            }
        }
        catch (final IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
