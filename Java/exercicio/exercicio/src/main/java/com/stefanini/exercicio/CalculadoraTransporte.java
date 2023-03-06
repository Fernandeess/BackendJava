/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.exercicio;

/**
 *
 * @author mfrodrigues2
 */
public class CalculadoraTransporte {

    public Double calcularPassagensMensais(Double pricePassagem, Integer qntdDias) {
        if (qntdDias > 31 || qntdDias < 0) {
            System.out.println("Valor Invalido");

        } else {
            Double totalGastoMensal;
            Double totalGastoDiario;
            totalGastoDiario = pricePassagem * 2;
            totalGastoMensal = totalGastoDiario * qntdDias;

            return totalGastoMensal;
        }
        return null;

    }

}
