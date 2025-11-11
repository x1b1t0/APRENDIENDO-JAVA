public class Hora d'apertura {
    
    package Ejercicios;
import java.util.Scanner;

System.out.println("=== HORA D'APERTURA ===");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el dia de la setmana (1-7, on 1 és dilluns i 7 diumenge): ");
        int dia = sc.nextInt();

        if (dia) == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 {
            System.out.println("L'horari d'apertura és de 9:00 a 20:00.");
        } else if (dia == 6) {
            System.out.println("L'horari d'apertura és de 10:00 a 18:00.");
        } else (dia == 7) {
            System.out.println("El negoci està tancat.");
        }
}
