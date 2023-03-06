/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.exercicio;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 1
 *
 * @author mfrodrigues2
 */
public class Main {

    public static void main(String[] args) {
        Boolean keepRunning = true;
        Scanner sc = new Scanner(System.in);
        String nome;
        Integer selecao;
        Menu menu = new Menu();
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        Pessoa pessoa = new Pessoa();
        Pegunta pergunta = new Pergunta();
        pessoa.setNome(nome);
        menu.exibirMsgBoasVindas(nome);
        CalculadoraTransporte calculadoraT = new CalculadoraTransporte();
        while (keepRunning) {
            menu.exibirOpcoes();
            selecao = sc.nextInt();
            switch (selecao) {
                case 1:
                    System.out.println("Preço que você paga na passagem:");
                    Double price = sc.nextDouble();
                    System.out.println("Quantos dias no mês você utiliza o trem: ");
                    Integer dias = sc.nextInt();
                    System.out.println(String.format("\n\nEm %d dias usando o trem voce gasta: %.2f R$\n\n", dias, calculadoraT.calcularPassagensMensais(price, dias)));
                    pessoa.setGastoMensal(calculadoraT.calcularPassagensMensais(price, dias));
                    break;
                case 2:
                    Integer perguntaSelecionada;
                    System.out.println("Lista de peguntas");
                    pergunta.exibirListaPerguntas();
                    System.out.println("Digite o numero da pergunta para receber uma resposta: ");
                    perguntaSelecionada = sc.nextInt();
                    pergunta.exibirResposta(perguntaSelecionada);
                    break;
                case 3:
                    pessoa.exibirDados();
                    break;
                case 4:
                    System.out.println("Acerte um número de 1 a 10\nAcerte nas primeiras chanches para ganhar mais pontos (: < _ >");
                    Integer numSorted = ThreadLocalRandom.current().nextInt(1, 10);
                    System.out.println("número Sorteado " + numSorted);
                    Integer numSelected;
                    Integer pontos = 0;
                    for (int i = 10; i > 0; i--) {
                        System.out.println(String.format("Rodada: %d", i));
                        numSelected = sc.nextInt();
                        while (numSelected > 10 || numSelected < 1) {
                            System.out.println("Número inválido\nDigite novamente:");
                            numSelected = sc.nextInt();
                        }
                        if (numSelected == numSorted) {
                            pontos += 100 * i;
                            System.out.println("Você Acertou");

                            break;
                        } else {
                            System.out.println("Tente novamente!!");
                        }

                    }
                    Integer oldPonts = pessoa.getPontos();
                    pessoa.setPontos(oldPonts + pontos);
                    System.out.println(String.format("Pontuação atual: %d", pontos));
                    System.out.println(String.format("Pontuação total: %d", pessoa.pontos));
                    break;
                case 5:
                    System.out.println("-----------------------------\no programa está se encerrando\n-----------------------------");
                    keepRunning = false;
                    break;
                default:

            }
        }

    }

    private static class Pergunta extends Pegunta {

        public Pergunta() {
        }
    }
}
