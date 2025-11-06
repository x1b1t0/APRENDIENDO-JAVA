package Ejercicios;
import java.util.Scanner;
public class Aprovaono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Llegim la quantitat d'alumnes
        int n = scanner.nextInt();

        // Llegim cada alumne i la seva nota
        for (int i = 0; i < n; i++) {
            String nom = scanner.next();
            String cognom = scanner.next();
            double nota = scanner.nextDouble();

            if (nota >= 5.0) {
                System.out.println(nom + " " + cognom + ": aprova");
            } else {
                System.out.println(nom + " " + cognom + ": suspèn");
            }
        }

        scanner.close();
    }
}

