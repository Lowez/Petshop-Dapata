/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luizmatheus.controller;

import br.com.luizmatheus.model.*;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Computação
 */
public class Gravar_Arquivo {
    
    public void gravarArq(String nome_arq, Object obj) throws FileNotFoundException, IOException{
        FileOutputStream arq = null;
        arq = new FileOutputStream(nome_arq + ".txt");
        
        ObjectOutputStream obj_new;
        obj_new = new ObjectOutputStream(arq);

        obj_new.writeObject(obj);
        obj_new.flush();

        JOptionPane.showMessageDialog(null, nome_arq + " -> Gravado com sucesso!");
    }
}
