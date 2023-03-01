/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.lambda;

/**
 *
 * @author mfrodrigues2
 */
public class Pessoa {
      private String nome;
      private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    public Pessoa(String nome,Integer idade){
            this.nome =nome;
            this.idade = idade;
    }
   
    
    
    
}
