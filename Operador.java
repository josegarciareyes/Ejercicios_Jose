import java.util.Scanner;

public class Operador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un valor entero al usuario
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        
        // Determinar si el número es positivo
        if (numero > 0) {
            System.out.print("Ingresa otro número entero: ");
            int numero2 = scanner.nextInt();

            float suma =  numero + numero2;
            float resta =  numero - numero2;
            float multiplicacion =  numero *  numero2; 

            System.out.println("La suma de " + numero + " + " + numero2 + " es: " + suma);
            System.out.println("La resta de " + numero + " - " + numero2 + " es: " + resta);
            System.out.println("La multiplicacion de " + numero + " * " + numero2 + " es: " + multiplicacion);
           

        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        scanner.close();
    }
}
 