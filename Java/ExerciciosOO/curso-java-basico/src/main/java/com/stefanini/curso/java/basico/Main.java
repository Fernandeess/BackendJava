/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.curso.java.basico;

/**
 *
 * @author mfrodrigues2
 */
public class Main {
    public static void main(String[] args)  {
        BMW bmw = new BMW();
        bmw.setModelo("M3");
        bmw.setMarca("BMW"); 
        bmw.setQuilometrosPorLitro(7.5);
        bmw.setTaxaAceleracao(50);
        try{
            bmw.setVelocidadeMaxima(150.00);
                }catch(Exception e){
            System.out.println(e);
        }finally{System.out.println("Passou aqui");}
        
        System.out.println(bmw.getMarca());
        System.out.println(bmw.getModelo());
        System.out.println(bmw.getQuilometrosPorLitro());
        System.out.println(bmw.getTaxaAceleracao());
        System.out.println(bmw.getVelocidadeMaxima());
        
        bmw.acelerar();
        bmw.frear();
        bmw.acionarTurbo();
  
        System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 10.0  ));
        
        
        
        Tesla tesla = new Tesla();
        Carro teslaDois = new Tesla(); //Recebe apenas os atributos da classe pai
        tesla.setDirigeSozinho(true);
        System.out.println(tesla.isDirigeSozinho());
       teslaDois.frear();
        //Tesla teslaTres = new Carro(); // nem todo tesla e um carro mas um carro pode ser um tesla
        //casting
        ((Tesla) teslaDois).isDirigeSozinho();
        //casting transformando a variavel
        Carro[] carros = new Carro[]{bmw,tesla,teslaDois};
        for(Carro carro : carros){
            if(carro instanceof Tesla){
                System.out.println("Tesla");
            }else{
                System.out.println("Não e um tesla");
            }
        }
    }
}
