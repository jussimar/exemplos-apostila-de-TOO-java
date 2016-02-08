/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.excecao;

import java.util.Scanner;

public class calculo {
    public static void Principal(){
        Scanner e = new Scanner(System.in);
        
        String nome;
        int idade;
        int nascimento;
        
        System.out.println("Digite Seu Nome: ");
        nome = e.nextLine();
        
        System.out.println("Digite Sua idade: ");
        idade = e.nextInt();
        
        if(idade < 0){
            throw new IllegalArgumentException();
        }
        
        nascimento = 2015 - idade;
        
        
        System.out.println("O nome é: " + nome + " E você nasceu em: " + nascimento);
    }
}
