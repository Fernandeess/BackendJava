/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoaobjetos.executor;

import orientacaoaobjetos.Carro;
import orientacaoaobjetos.entidade.BMW;

/**
 *
 * @author fernandes
 */
public class Executor {

    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.setMarca("BMW");
        carro01.setModelo("320i");
        carro01.setChassi(99999);
        carro01.setPlaca("XXX99999");
        carro01.setBancos(5);
        carro01.setVelocidade(280);
        
        System.out.println(carro01.getMarca());
        System.out.println(carro01.getModelo());
        System.out.println(carro01.getChassi());
        System.out.println(carro01.getPlaca());
        System.out.println(carro01.getBancos());
        System.out.println(carro01.acelerar());
        
        BMW bmw = new BMW();
        System.out.println(bmw.getMarca());
        bmw.setVelocidade(300);
        System.out.println(bmw.acelerar());
    }
}
