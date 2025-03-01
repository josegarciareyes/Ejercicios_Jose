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
public class PotenciasNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definir el número total de números a ingresar
        final int TOTAL_NUMEROS = 10;

        // Usar un bucle for para procesar los números ingresados
        for (int i = 1; i <= TOTAL_NUMEROS; i++) {
            // Solicitar al usuario un número
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();

            // Calcular el cubo y la cuarta potencia
            double cubo = Math.pow(numero, 3);
            double cuarta = Math.pow(numero, 4);

            // Mostrar los resultados
            System.out.println("Número: " + numero);
            System.out.println("Cubo: " + cubo);
            System.out.println("Cuarta potencia: " + cuarta);
            System.out.println("-----------------------------");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
