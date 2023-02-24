/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.aprendendo.com.eclipse;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author mfrodrigues2
 */
public class Matrizes {
    public static void main(String[] args) {
        Integer linha = 3;
Integer coluna = 5;
    int[][] numeros = new int[linha][coluna];
for(Integer i = 0; i < linha; i++){
    for(Integer c = 0; c < coluna; c++){
        
    Integer nRandom = ThreadLocalRandom.current().nextInt(1,100);
    numeros[i][c] = nRandom;
    System.out.println(numeros[i][c]);
}
}
    }

}
