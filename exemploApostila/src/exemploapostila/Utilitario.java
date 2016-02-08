/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploapostila;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 *
 * @author Jussimar
 */
public class Utilitario {
    
    public static String data;
    
    public static String getData(){
        DateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = new Date();
        return data.format(d);
    }
    
    public static void MostrarDados(String nome, String sobrenome, String cor, 
                                    int idade, double peso, int num, String doc)
    {
        System.out.println("Nome Completo: " + nome + " " + sobrenome);
        System.out.println("Idade: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Cor: " + cor);
        System.out.println("Numero de Funcionario: " + num);
        System.out.println("CPF: " + doc);
        System.out.println("Data: " + data);
    }
    
}
