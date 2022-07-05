/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luizmatheus.controller;

import br.com.luizmatheus.model.Banho;
import br.com.luizmatheus.model.Consulta;
import br.com.luizmatheus.model.Estagiario;
import br.com.luizmatheus.model.Funcionario;
import br.com.luizmatheus.model.Racao;
import br.com.luizmatheus.model.Roupa;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Computação
 */
public class Ler_Arquivo {
    
    public void lerConsulta(String nome_arq) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream arqIn = null;
        arqIn = new FileInputStream(nome_arq + ".txt");
        ObjectInputStream objIn = null;
        objIn = new ObjectInputStream(arqIn);
        
        Consulta consultaIn;
        consultaIn = (Consulta)objIn.readObject();
        JOptionPane.showMessageDialog(null, String.format("Custo: %f\nData Agendada: %s\nNome do Veterinário: %s\nTipo do Animal: %s\nNome do Animal: %s"
                    + "", consultaIn.getCusto(), consultaIn.getDataAgendada(), consultaIn.getNomeVeterinarioResponsavel(), consultaIn.getTipo_animal(), consultaIn.getNome_animal()));
        
        arqIn.close();
    }
    
    public void lerBanho(String nome_arq) throws IOException, ClassNotFoundException {
        FileInputStream arqIn = null;
        arqIn = new FileInputStream(nome_arq + ".txt");
        ObjectInputStream objIn = null;
        objIn = new ObjectInputStream(arqIn);
        
        Banho banhoIn;
        banhoIn = (Banho)objIn.readObject();
        JOptionPane.showMessageDialog(null, String.format("Custo: %f\nData Agendada: %s\nNome do Shampoo: %s\nNome do Estagiário: %s\nTipo do Animal: %s\nNome do Animal: %s", 
                banhoIn.getCusto(), banhoIn.getDataAgendada(), banhoIn.getTipoShampoo(), banhoIn.getNomeEstagiario(), banhoIn.getTipo_animal(), banhoIn.getNome_animal()));
        arqIn.close();
    }
    
    public void lerRacao(String nome_arq) throws IOException, ClassNotFoundException {
        FileInputStream arqIn = null;
        arqIn = new FileInputStream(nome_arq + ".txt");
        ObjectInputStream objIn = null;
        objIn = new ObjectInputStream(arqIn);
        
        Racao racaoIn;
        racaoIn = (Racao)objIn.readObject();
        JOptionPane.showMessageDialog(null, String.format("Preço de Venda: %f\nCusto: %f\nFornecedor: %s\nNome da Ração: %s\nPeso: %f\nQualidade: %s",
                racaoIn.getPrecoDeVenda(), racaoIn.getCusto(), racaoIn.getFornecedor(), racaoIn.getNome_racao(), racaoIn.getPeso(), racaoIn.getQualidade()));
        
        arqIn.close();
    }
    
    public void lerRoupa(String nome_arq) throws IOException, ClassNotFoundException {
        FileInputStream arqIn = null;
        arqIn = new FileInputStream(nome_arq + ".txt");
        ObjectInputStream objIn = null;
        objIn = new ObjectInputStream(arqIn);
        
        Roupa roupaIn;
        roupaIn = (Roupa)objIn.readObject();
        JOptionPane.showMessageDialog(null, String.format("Preço de Venda: %f\nCusto: %f\nFornecedor: %s\nTamanho: %s\nCor: %s",
                roupaIn.getPrecoDeVenda(), roupaIn.getCusto(), roupaIn.getFornecedor(), roupaIn.getTamanho(), roupaIn.getCor()));
        
        arqIn.close();
    }
    
    public void lerFuncionario(String nome_arq) throws IOException, ClassNotFoundException {
        FileInputStream arqIn = null;
        arqIn = new FileInputStream(nome_arq + ".txt");
        ObjectInputStream objIn = null;
        objIn = new ObjectInputStream(arqIn);
        
        Funcionario funcionarioIn;
        funcionarioIn = (Funcionario)objIn.readObject();
        JOptionPane.showMessageDialog(null, String.format("Nome: %s\nIdade: %d\nEndereço: %s\nSexo: %s\nAltura: %f\nTelefone: %s\nRegistro: %s\nSalário: %s"
                    + "", funcionarioIn.getNome(), funcionarioIn.getIdade(), funcionarioIn.getEndereco(), funcionarioIn.getSexo(), funcionarioIn.getAltura(), funcionarioIn.getTelefone(), funcionarioIn.getRegistro(), funcionarioIn.getSalario()));
        
        arqIn.close();
    }
    
    public void lerEstagiario(String nome_arq) throws IOException, ClassNotFoundException {
        FileInputStream arqIn = null;
        arqIn = new FileInputStream(nome_arq + ".txt");
        ObjectInputStream objIn = null;
        objIn = new ObjectInputStream(arqIn);
        
        Estagiario estagiarioIn;
        estagiarioIn = (Estagiario)objIn.readObject();
        JOptionPane.showMessageDialog(null, String.format("Nome: %s\nIdade: %d\nEndereço: %s\nSexo: %s\nAltura: %f\nTelefone: %s\nRegistro: %s\nSalário: %s\nBolsa: %s\nHoras de Serviço: %d"
                    + "", estagiarioIn.getNome(), estagiarioIn.getIdade(), estagiarioIn.getEndereco(), estagiarioIn.getSexo(), estagiarioIn.getAltura(), estagiarioIn.getTelefone(), estagiarioIn.getRegistro(), estagiarioIn.getSalario(), estagiarioIn.getBolsa(), estagiarioIn.getHoras_servico()));
        
        arqIn.close();
    }
}
