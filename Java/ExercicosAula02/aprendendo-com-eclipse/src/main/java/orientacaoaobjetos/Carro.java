/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoaobjetos;

/**
 *
 * @author fernandes
 */
public class Carro {

    private String nome;
    private String marca;
    private Integer chassi;
    private String placa;
    private Integer velocidade;
    private Double roda;
    private Integer bancos;
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Carro() {
        System.out.println("Construido o carro");
    }

    public Carro(String marca) {
        this.marca = marca;
    }
//Sobrecarregamos o construtor //Diferentes assinaturas

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public String acelerar() {
        String msgVelocidade = String.format(" %d km/5s", this.velocidade);
        return msgVelocidade;
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

    public Integer getChassi() {
        return chassi;
    }

    public void setChassi(Integer chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getRoda() {
        return roda;
    }

    public void setRoda(Double roda) {
        this.roda = roda;
    }

    public Integer getBancos() {
        return bancos;
    }

    public void setBancos(Integer bancos) {
        this.bancos = bancos;
    }

    

}
