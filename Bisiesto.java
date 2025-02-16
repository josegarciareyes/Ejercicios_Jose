import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un valor entero al usuario
        System.out.print("Ingresa un año: ");
        int numero = scanner.nextInt();

        
        // Determinar si el número es positivo o negativo
        if (numero % 2 == 0 ) {
                        
          System.out.println("El año es bisieto");
                
             
        } else {
            System.out.println("El año no es bisiesto.");
        }

        scanner.close();
    }
    
}