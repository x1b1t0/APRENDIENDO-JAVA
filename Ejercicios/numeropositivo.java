package Ejercicios;
import java.util.Scanner;

public class numeropositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Pedir al usuario que ingrese un número positivo
        do {
            System.out.print("Por favor, ingresa un número positivo: ");
            numero = scanner.nextInt();
        } while (numero <= 0);  // Repite hasta que el número sea positivo

        System.out.println("El número ingresado es: " + numero);
    }
}
    
