package Ejercicios;

import java.util.Scanner;

public class CursaSalut {

    public static void main (String [] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int menorA = 0, menorB = 0, juvenil = 0, adult = 0, adultMajor = 0;
        int totalParticipants = 0;
        
        while (true) {
            System.out.println("Introdueix el teu dni (o 'fin' per acabar):");
            String dni = sc.nextLine();

            if (dni.equalsIgnoreCase("fin")) {
                break;
            }
            
            System.out.println("Introdueix el teu nom:");
            String nom = sc.nextLine();

            System.out.println("Introdueix la teva edat:");
            int edat = sc.nextInt();
            sc.nextLine();                

            if (edat >= 6 && edat <= 10) {
                System.out.println("La teva categoria es Menor A");
                menorA++;
            } else if (edat >= 11 && edat <= 17) {
                System.out.println("La teva categoria es Menor B");
                menorB++;
            } else if (edat >= 18 && edat <= 31) {
                System.out.println("La teva categoria es Juvenil");
                juvenil++;
            } else if (edat >= 32 && edat <= 50) {
                System.out.println("La teva categoria es Adult");
                adult++;
            } else if (edat > 50) {
                System.out.println("La teva categoria es Adult major");
                adultMajor++;
            } else if (edat < 6) {
                System.out.println("No pots participar en la cursa");
                continue;
            }
            
            totalParticipants++;
        }
        
        System.out.println("=== RESUM DE PARTICIPANTS ===");
        System.out.println("Menors A: " + menorA);
        System.out.println("Menors B: " + menorB);
        System.out.println("Juvenils: " + juvenil);
        System.out.println("Adults: " + adult);
        System.out.println("Adults majors: " + adultMajor);
        System.out.println("Total participants: " + totalParticipants);
    }       
}
