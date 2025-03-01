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
public class LetraRepetida {
    public static void letraRepetida(char letra, int veces) {
        // Usar un bucle for para repetir la letra
        for (int i = 0; i < veces; i++) {
            System.out.print(letra); // Mostrar la letra sin salto de línea
        }
        System.out.println(); // Saltar a la siguiente línea al final
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario una letra
        System.out.print("Ingrese una letra: ");
        char letra = scanner.next().charAt(0);

        // Solicitar al usuario un número de repeticiones
        System.out.print("Ingrese el número de veces que se repetirá la letra: ");
        int veces = scanner.nextInt();

        // Llamar a la función "letraRepetida"
        letraRepetida(letra, veces);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
