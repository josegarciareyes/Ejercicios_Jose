import java.util.Scanner;

public class EstadodeAgua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un valor entero al usuario
        System.out.print("Ingresa valor de temperatura del agua: ");
        int temperatura = scanner.nextInt();

        
        // Determinar si el número es positivo o negativo
        if (temperatura < 0) {
            System.out.println("El agua está en estado sólido ");

        } else if (temperatura > 0 && temperatura < 100) {

            System.out.println("El agua está en estado liquido ");
        } else {
            System.out.println("El agua está en estado gaseoso.");
        }

        scanner.close();
    }
    
}