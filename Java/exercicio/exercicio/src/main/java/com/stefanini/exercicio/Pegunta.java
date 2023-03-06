/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.exercicio;

/**
 *
 * @author fernandes
 */
public class Pegunta {

    public void exibirListaPerguntas() {
        System.out.println("1 - Como posso comprar passagens de trem?\n"
                + "\n"
                + "2 - Qual é a política de reembolso da empresa em caso de cancelamento de viagem?\n"
                + "\n"
                + "3 - É possível fazer reservas de assento antecipadamente?\n");
    }

    public void exibirResposta(Integer resposta) {
        if (resposta == 1) {
            System.out.println("\n\nR: As passagens podem ser compradas online, por telefone ou em uma estação de trem.\n\n");
        } else if (resposta == 2) {
            System.out.println("\n\nR: Depende do tipo de bilhete, mas geralmente é possível obter um reembolso total ou parcial.\n\n");
        } else if (resposta == 3) {
            System.out.println("\n\nR: Sim, é possível fazer reservas de assento antecipadamente, sujeito à disponibilidade.\n\n");
        }
    }
}
