import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un valor entero al usuario
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        // Determinar si el número es positivo o negativo
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        scanner.close();
    }
    
}
 



        // Determinar si el número es positivo o negativo
        

 