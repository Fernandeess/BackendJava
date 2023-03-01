/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.curso.java.basico;

/**
 *
 * @author mfrodrigues2
 */
/*

*/
public class BMW extends Carro implements Esportivo{ 

    @Override
    String acelerar() { //sobrescrita do metodo ///
        System.out.println("Sobrescrita");
        String msgAcelerar = "BMW Acelera loucamente";
        return msgAcelerar;
    }

    @Override
    public void acionarTurbo() {
    System.out.println("Turbo");
    }
    
    
}
