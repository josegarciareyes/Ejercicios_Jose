/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Est01
 */
public class MayusculasAMinusculas {
    public static void main(String[] args) {
        
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            
            char letraMinuscula = Character.toLowerCase(letra);
           
            System.out.println(letra + " -> " + letraMinuscula);
        }
    }
}

