/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_2;

import java.util.Scanner;

/**
 *
 * @author vmontestovar
 */
public class Bol2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("teclee los grados celcius que quiere convertir a fahrenheit y kelvin");
        float celcius=teclado.nextFloat();
        float fahrenheit=(celcius*1.8f)+32;
        float kelvin=celcius+273.15f;
        System.out.println(celcius+" grados celcius son "+fahrenheit+" grados farhenhein y "+kelvin+" grados kelvin");
        
        
        
        
        
        // TODO code application logic here
    }
    
}
