/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.aprendendo.com.eclipse;

/**
 *
 * @author mfrodrigues2
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {
    int soma = 10 + 5; //infix
    int subtracao = 10 -5;
    int multiplicacao = 10 *5;
    int divisao = 10 /5;
    int resto = 10 % 5;
    int a = 10;
     a++; //postfix
     a--;
     --a; //prefix
     --a;
        System.out.println(++a == 11);
        System.out.println(a++ == 11);
        System.out.println(11 == ++a);
        System.out.println(11 == a++);
    }
    
}
