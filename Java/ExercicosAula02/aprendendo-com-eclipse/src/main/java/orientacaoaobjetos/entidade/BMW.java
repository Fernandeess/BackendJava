/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoaobjetos.entidade;

import orientacaoaobjetos.Carro;

/**
 *
 * @author fernandes
 */
public class BMW extends Carro {

    public BMW() {
        this.setMarca("BMW");
    }

    @Override
    public String acelerar() {
        return String.format("A BMW pode fazer de 0 a %d em 5s", getVelocidade() ); //sobescrita do metodo acelerar
    }
    
}
