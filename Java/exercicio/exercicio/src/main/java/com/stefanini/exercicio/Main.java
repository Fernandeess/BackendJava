/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.exercicio;

import java.util.Scanner;

/**1
 *
 * @author mfrodrigues2
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        Integer selecao;
        Menu menu = new Menu();
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        menu.exibirMsgBoasVindas(nome);
        CalculadoraTransporte calculadoraT = new CalculadoraTransporte();
        while (true) {            
            menu.exibirOpcoes();
            selecao = sc.nextInt();
            switch (selecao) {
                case 1:
            
             Double price = sc.nextDouble();
             Integer dias = sc.nextInt();
                    System.out.println(String.format("Em %f dias usando o tremm voce gasta : %.2f R$", calculadoraT.calcularPassagensMensais(price, dias)));
                    ;
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    
            }
        }
        
        
    }
}
