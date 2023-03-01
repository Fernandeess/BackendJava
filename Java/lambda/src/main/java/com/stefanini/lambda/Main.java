/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.lambda;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 *
 * @author mfrodrigues2
 */
public class Main {
    static Integer gerarIdade(Integer min,Integer max){
       return ThreadLocalRandom.current().nextInt(min, max);
    }
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Alice","João","Maria","Pedro","Raquel","Samuel");
        //Stream e lambda veio a partir do java 8
//        nomes.forEach((n)-> System.out.println(n));
//        System.out.println("Lista de pessoas ");
//       List<Pessoa> pessoas = nomes.stream().map((n) -> new Pessoa(n,gerarIdade(15,30))).collect(Collectors.toList());
//        pessoas.forEach((p)-> System.out.println(p.getNome()+" "+ p.getIdade()));
//        System.out.println("Lista Pessoas maiores de idade: ");
//        List<Pessoa> pessoasMaioresDeIdade = pessoas.stream().filter((p)-> p.getIdade() >= 18).collect(Collectors.toList());
//        System.out.println("Lista de pessoas ordenadas");
//        pessoasMaioresDeIdade.forEach((p)-> System.err.println(p.getNome()+" "+p.getIdade()));
//        List<Pessoa> pessoasOrdenadas = pessoas.stream().sorted((p1,p2)-> p1.getIdade() - p2.getIdade()).collect(Collectors.toList());
//        pessoasOrdenadas.forEach( p-> System.err.println(p.getNome()+" "+ p.getIdade()));
//        System.out.println("Soma das Idades: ");
//        Integer totalIdade = pessoasOrdenadas.stream().map(p->p.getIdade()).reduce(0, (somaIdade,idade) -> somaIdade +=idade);
//        System.out.println(totalIdade);
        List<Integer> lista = Arrays.asList(2,5,8,9,2,4,7,6,6,9,9);
        //stream não modifica a lista /ela retorna um array novo
                                    //Operações intermediarias
                 //A lista original não e modificada//map tem a ver com a transformação do dado atual nesse exemplo todos os dados serão multiplicados por 2
                //filtrar, limitar, skip antes de fazer alterções nos dados se possivel // poupar processamento?
                //.filter(e->  e % 2 == 0) // o e esta referenciando ao dado atual do array
                //.distinct() //não deixa dados repetido caso haja 2 dados iguais o primeiro ira se manter.
                //.skip(2) //pula uma quantidade de dados do array
                //.limit(3) limita a quantidade de dados a ser processado
                //OPERACOES FINAIS
                //CASO CHAMADA NÂO PODERA FAZER MAIS ALTERAÇÔES
                //.count(); // Nota!! por algum motivo o count retorna um long
                //.forEach(e-> System.out.println(e)); ///percorrendo o array
//        long count = lista.stream()
//                .filter(e -> e%2 ==0)
//                .count();
//        Optional<Integer> min = lista.stream()
//                .distinct()
//        .min(Comparator.naturalOrder());
//        Optional<Integer> max = lista.stream()
//                .distinct()
//        .max(Comparator.naturalOrder());
//        System.out.println(count);]
//System.out.println(min.get());
//System.out.println(max.get());
     List<Integer>  numerosPares = lista.stream()
             .filter(e-> e%2 == 0)
             .collect(Collectors.toList());
        System.out.println(numerosPares);
    }
}
