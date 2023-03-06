/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.exercicio;

/**
 *
 * @author mfrodrigues2
 */
public class Pessoa {

    String nome = "Unnamed";
    Double gastoMensal = 0.0;
    Integer pontos = 0;

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getGastoMensal() {
        return gastoMensal;
    }

    public void setGastoMensal(Double gastoMensal) {
        this.gastoMensal = gastoMensal;
    }

    public void exibirDados() {
        System.out.println(String.format("\n\n\nNome: %s \nGasto mensal transporte(Trem): %.2f\nPontos:%d \n\n\n", getNome(), getGastoMensal(), getPontos()));
    }
}
