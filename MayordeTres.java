import java.util.Scanner;

public class MayordeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un valor entero al usuario
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        System.out.print("Ingresa otro número entero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingresa otro número entero: ");
        int numero3 = scanner.nextInt();


        // Determinar si el número es positivo o negativo
        if (numero > numero2 && numero > numero3) {
            System.out.println("El número " + numero + " es mayor que el número " + numero2 + " y que el número " + numero3);

          } 
         else if (numero2 > numero && numero2 > numero3) {
            System.out.println("El número " + numero2 + " es mayor que el número " + numero + " y que el número " + numero3);

          }           

          else if (numero3 > numero && numero3 > numero2) {
            System.out.println("El número " + numero3 + " es mayor que el número "+ numero + " y que el número" + numero2 );

          }

          else {
            System.out.println("Los números son iguales.");
          }

        scanner.close();
    }
    
}