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
public class FuncionDivision {
    // Definición de la función "division"
    public static double division(int numero1, int numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("La división entre cero no está permitida.");
        }
        return (double) numero1 / numero2;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los números del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el primer número
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        // Solicitar al usuario el segundo número
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        try {
            // Llamar a la función "division" y obtener el resultado
            double resultado = division(numero1, numero2);

            // Mostrar el resultado
            System.out.println("El resultado de dividir " + numero1 + " entre " + numero2 + " es: " + resultado);
        } catch (ArithmeticException e) {
            // Manejar el caso de división por cero
            System.out.println("Error: " + e.getMessage());
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
