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
public class PromedioCalificaciones {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer las calificaciones
        Scanner scanner = new Scanner(System.in);

        // Definir el número de calificaciones
        final int NUM_CALIFICACIONES = 7;
        double sumaCalificaciones = 0;

        // Solicitar al usuario las calificaciones usando un bucle for
        for (int i = 1; i <= NUM_CALIFICACIONES; i++) {
            System.out.print("Ingrese la calificación " + i + ": ");
            double calificacion = scanner.nextDouble();

            // Acumular las calificaciones
            sumaCalificaciones += calificacion;
        }

        // Calcular el promedio
        double promedio = sumaCalificaciones / NUM_CALIFICACIONES;

        // Mostrar el promedio
        System.out.println("\nEl promedio de las calificaciones es: " + promedio);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
