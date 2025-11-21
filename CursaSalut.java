package Ejercicios;

import java.util.Scanner;

public class CursaSalut {

    // • Menors A (de 6 a 10 anys)
    // • Menors B (d'11 a 17 anys)
    // • Juvenils (de 18 a 30 anys)
    // • Adults (de 31 a 50 anys)
    // • Adults majors (més de 50 anys)
    public static void main (String [] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix el teu dni:");
        String dni = sc.nextLine();
        
        System.out.println("Introdueix el teu nom:");
        String nom = sc.nextLine();

        System.out.println("Introdueix la teva edat:");
        int edat = sc.nextInt();

        if (edat >= 6 && edat <= 10) {
            System.out.println("La teva categoria es Menor A");
        } else if (edat >= 11 && edat <= 17) {
            System.out.println("La teva categoria es Menor B");
        } else if (edat >= 18 && edat <= 30) {
            System.out.println("La teva categoria es Juvenil");
        } else if (edat >= 31 && edat <= 50) {
            System.out.println("La teva categoria es Adult");
        } else if (edat > 50) {
            System.out.println("La teva categoria es Adult major");
        } else if (edat < 6) {
            System.out.println("No pots participar en la cursa");
        }
        
    }       
}
