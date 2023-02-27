/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.curso.java.basico;

/**
 *
 * @author mfrodrigues2
 */
public class Carro {
    /*
    Modificadores de acesso
    Default => ausencia do modificador de acesso Não e uma (palavra chave reservada).Acessivel propria classe ou classe de um mesmo pacote
    Public => Acessivel propria classe ,classe mesmo pacote, subclasse (extends),todas as demais classes.
    Protected => Acessivel propria classe ,classe mesmo pacote, subclasse (extends)
    Private => Acessivel apenas propria classe
    
    this. referencia um atributo da propria classe
    
    */
    private String nome;
    private String marca;
    private String modelo;
    private Double velocidadeMaxima;
    private Integer taxaAceleracao;
    private Double quilometrosPorLitro;

    public Carro(){
        System.out.println("Construtor carro");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Integer getTaxaAceleracao() {
        return taxaAceleracao;
    }

    public void setTaxaAceleracao(Integer taxaAceleracao) {
        this.taxaAceleracao = taxaAceleracao;
    }

    public Double getQuilometrosPorLitro() {
        return quilometrosPorLitro;
    }

    public void setQuilometrosPorLitro(Double quilometrosPorLitro) {
        this.quilometrosPorLitro = quilometrosPorLitro;
    }
    
    String acelerar(){
        String msgAcelerar = "Acelerando";
        return msgAcelerar;
    }
    void frear(){
        System.out.println("Freando....");
    }
    Double calcularTaxaAceleracao(Double velocidadeFinal, Double velocidadeInicial, Double tempoFinal, Double tempoInicial){
        return (velocidadeFinal - velocidadeInicial) / (tempoFinal - tempoInicial) * 3.6;
    }
    Double calcularTaxaAceleracao(Double velocidadeFinal, Double tempoFinal){
        return (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6; //sobrecarga
    }
}
