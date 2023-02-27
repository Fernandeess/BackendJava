/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.estrutura.de.controle;

/**
 *
 * @author mfrodrigues2
 */
public class Loop {
    public static void main(String[] args) {
        
        Integer i = 0;
    while(i  < 10){
        i++;
        System.out.printf("Contador: %d \n",i);
        if(i == 10){
            System.out.println("Booom!!!!");
        }
    }
        Integer j =50;
    do{
        System.out.printf("Contador: %d \n ",j); 
        j--;
    }while(j >= 1);
    
        for (int k = 0; k < 100; k++) {
             System.out.printf("Contador: %d \n ",k); 
        }
        //nada e obrigatorio no for 
}}
