/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.exercicio;

/**
 *
 * @author mfrodrigues2
 */
public class Menu {

    public void exibirMsgBoasVindas(String nome) {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(String.format("         Seja bem vindo %s         ", nome));
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }

    public void exibirOpcoes() {
        System.out.println("Selecione uma das opções abaixo");
        System.out.println("""
                           1 -  Calcule o quanto você gasta com Trem;
                           2 -  Perguntas;
                           3 -  Meus dados;
                           4 -  Acerte o numero;
                           5 -  Sair;""");
    }
}
