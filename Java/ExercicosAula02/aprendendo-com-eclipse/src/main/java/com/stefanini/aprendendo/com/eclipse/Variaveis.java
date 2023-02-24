/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stefanini.aprendendo.com.eclipse;

/**
 *
 * @author mfrodrigues2
 */
public class Variaveis {
    byte numByte = 127; //-128 a 127 (8 bits)
    short numShort = 12321; // -32768 a 32767 (16 bits)
    int numInt = 25; // -2.147.483.648 a 2.147.483.647(32 bits);
    Integer numInteger = 25; // class wraper
    long numLong = 2147483647; // -9.223.372.036.854.770.000 a 9.223.372.036.854.770.000(64 bits);
    Long numLongWrapper = 1213123L ;
    
    float numFloat = 10.000f; //-1,40224E-37 a 3.40282347E+38(32 bits)
    Float numFloatWrapper = 10.000f; //-1,40224E-37 a 3.40282347E+38(32 bits)
    Double numDoubleWraper =1000000000000000000.00; //wraper
    double numDouble =1000000000000000000.00; //-49,E-307 a 1.79769313486231570E+308(64 bits)
    char varChar = 'f';// 0 a 65536 (16 bits) obs!! é necessario o uso de aspas simples
    
    boolean varBoolean = true;
    Boolean isBigger = 5 > 6; // false. wrapper // true or false (1 bit)
    String texto = "Hello World";
    
}
