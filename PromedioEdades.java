/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.Random;


/**
 *
 * @author Est01
 */
public class PromedioEdades {
    public static void main(String[] args) {
        // Definir el número de alumnos y los límites de las edades
        final int NUM_ALUMNOS = 100;
        final int EDAD_MINIMA = 18;
        final int EDAD_MAXIMA = 50;

        // Crear un objeto Random para generar las edades aleatorias
        Random random = new Random();

        // Variable para acumular la suma de las edades
        int sumaEdades = 0;

        // Generar y procesar las edades utilizando un bucle for
        for (int i = 1; i <= NUM_ALUMNOS; i++) {
            // Generar una edad aleatoria entre EDAD_MINIMA y EDAD_MAXIMA
            int edad = random.nextInt(EDAD_MAXIMA - EDAD_MINIMA + 1) + EDAD_MINIMA;
            System.out.println("Edad del alumno " + i + ": " + edad);

            // Sumar la edad a la suma total
            sumaEdades += edad;
        }

        // Calcular el promedio
        double promedio = (double) sumaEdades / NUM_ALUMNOS;

        // Mostrar el promedio de las edades
        System.out.println("\nEl promedio de las edades es: " + promedio);
    }
}
