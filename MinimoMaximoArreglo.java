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
public class MinimoMaximoArreglo {
    static class Resultado {
        double minimo;
        double maximo;

        public Resultado(double minimo, double maximo) {
            this.minimo = minimo;
            this.maximo = maximo;
        }
    }

    // Definición de la función "encontrarMinimoMaximo"
    public static Resultado encontrarMinimoMaximo(double[] arreglo, int longitud) {
        double minimo = Double.MAX_VALUE; // Inicializar el mínimo con el valor máximo posible
        double maximo = Double.MIN_VALUE; // Inicializar el máximo con el valor mínimo posible

        for (int i = 0; i < longitud; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }

        return new Resultado(minimo, maximo);
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la longitud del arreglo
        System.out.print("Ingrese la longitud del arreglo: ");
        int longitud = scanner.nextInt();

        // Crear el arreglo y llenarlo con valores ingresados por el usuario
        double[] arreglo = new double[longitud];
        System.out.println("Ingrese " + longitud + " números reales:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextDouble();
        }

        // Llamar a la función para encontrar el mínimo y máximo
        Resultado resultado = encontrarMinimoMaximo(arreglo, longitud);

        // Mostrar los valores mínimo y máximo
        System.out.println("El valor mínimo es: " + resultado.minimo);
        System.out.println("El valor máximo es: " + resultado.maximo);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
