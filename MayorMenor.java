import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un valor entero al usuario
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        System.out.print("Ingresa otro número entero: ");
        int numero2 = scanner.nextInt();

        // Determinar si el número es positivo o negativo
        if (numero > numero2) {
            System.out.println("El número " + numero + " es mayor que el número " + numero2);
        } else if (numero < numero2) {
            System.out.println("El número " + numero + " es menor que el número "+ numero2);
        } else {
            System.out.println("Los números son iguales.");
        }

        scanner.close();
    }
    
}