/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.aprendendo.com.eclipse;

import java.util.Arrays;

/**
 *
 * @author mfrodrigues2
 */
public class ForEach {
    public static void main(String[] args) {
        Integer[] listaNum = new Integer[]{0,1,2,3,4,5}; // print array
        System.out.println(Arrays.toString(listaNum));
    for(int i : listaNum){
            System.out.println(i);
    }
}
}
