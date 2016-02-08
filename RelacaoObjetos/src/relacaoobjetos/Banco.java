/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacaoobjetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jussimar
 */
public class Banco {
    protected List<Pessoa> pessoas = new ArrayList<Pessoa>();
    protected List<Cliente> clientes = new ArrayList<Cliente>();
    protected List<Filial> filiais = new ArrayList<Filial>();
    private String nome;

    
    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Filial> getFiliais() {
        return filiais;
    }

    public void setFiliais(List<Filial> filiais) {
        this.filiais = filiais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void MostrarPessoas(){
        System.out.println("Lista de Pessoas");
        
        for (Pessoa p : pessoas) {
            System.out.println("Nome: " + p.getNome() + " CPF: " + p.getCpf() + " Banco: " + p.getBanco().nome);
        }
    }
    
    public void MostrarClientes(){
        System.out.println("Lista de Clientes");
        
        for (Cliente c : clientes) {
            System.out.println("Nome: " + c.getNome() + " CPF: " + c.getCpf() + " Banco: " + c.getBanco().nome);
        }
    }
    
    public void MostrarFiliais(){
        System.out.println("Lista de Filiais");
        
        for (Filial f : filiais) {
            System.out.println("Cidade: " + f.getCidade() + " Num: " + f.getNumFilial() + " Banco: " + f.getBanco().nome);
        }
    }
}
