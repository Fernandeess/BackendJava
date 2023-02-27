/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.estrutura.de.controle;

/**
 *
 * @author mfrodrigues2
 */
public class IfElse {
    
    public static void main(String[] args) {
       Integer idade = 18;
       if(idade >= 18){
           System.out.println("Maior de idade");
       }
       
       if(idade >= 18){
           System.out.println("Maior de idade");
       }else{
           System.out.println("Menor de idade");
       }
       
       
       if(idade >= 100){
           System.out.println("Dracula?");
       }else  if(idade >= 18){
           System.out.println("Maior de idade");
       }else{
           System.out.println("Menor de idade");
       }
       if(idade >= 18) System.out.println("Maior de idade"); // if sem o bloco funciona mas pode causar desordem no codigo // Nunca Usar
    
       
        if(idade >= 18){
           System.out.println("Maior de idade");
            System.out.printf("Sua idade: %d", idade);
       }
        
        
       
       
    }
    
}
