/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author Est01
 */
public class RaizCubica {
    // Definición de la función "raizCubica"
    public static double raizCubica(double numero) {
        return Math.pow(numero, 1.0 / 3.0); // Elevar el número a 1/3 para calcular la raíz cúbica
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer el número ingresado por el usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número real
        System.out.print("Ingrese un número real: ");
        double numero = scanner.nextDouble();

        // Llamar a la función "raizCubica" y obtener el resultado
        double resultado = raizCubica(numero);

        // Mostrar el resultado
        System.out.println("La raíz cúbica de " + numero + " es: " + resultado);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
