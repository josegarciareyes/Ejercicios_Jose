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
public class FuncionSuma {
    // Definición de la función "suma"
    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
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

        // Llamar a la función "suma" y almacenar el resultado
        int resultado = suma(numero1, numero2);

        // Mostrar el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
