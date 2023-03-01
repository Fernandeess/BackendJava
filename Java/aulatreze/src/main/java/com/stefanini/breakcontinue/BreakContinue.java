/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.breakcontinue;

/**
 *
 * @author mfrodrigues2
 */
public class BreakContinue {
    public static void main(String[] args) {
        String[]carros = new String[] {"Mercedes c180","BMW M3","Mercedes AMG","Tesla Model S","BMW i320"};
        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i]);
            if(carros[i] == "BMW i320"){
                System.out.println(carros[i]);
                //break;para o for
                //continue não le o resto do codigo
            }
            
            System.out.println("Quero esse carro");
            System.out.println(carros[i]);
        }
    }
}
