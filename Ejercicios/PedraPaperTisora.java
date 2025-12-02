package Ejercicios;

import java.util.Scanner;
import java.util.Random;

public class PedraPaperTisora {
    public static void main(String[] args) {
        // Per acabar el joc de Pedra, Paper o Tisora
        // El caracter @ significa "Pedra"
        // El caracter # significa "Paper"
        // El caracter % significa "Tisora"

        String[] opcions = {"@", "#", "%"};

        System.out.println("Introdueix la teva elecció (Pedra '@', Paper '#', Tisora '%' o 'END' si vols sortir del programa):");

        Scanner sc = new Scanner(System.in);
        String eleccioJugador;

        do {
            eleccioJugador = sc.nextLine();

            if (eleccioJugador.equals("END")) {
                break;
            }

            if (!eleccioJugador.equals("@") && !eleccioJugador.equals("#") && !eleccioJugador.equals("%")) {
                System.out.println("Elecció no vàlida. Introdueix '@', '#', '%' o 'END'.");
                continue;
            }

            // Computer choice
            Random rand = new Random();
            int index = rand.nextInt(3);
            String eleccioOrdinador = opcions[index];

            // Determine winner
            String resultat;
            if (eleccioJugador.equals(eleccioOrdinador)) {
                resultat = "Empat!";
            } else if ((eleccioJugador.equals("@") && eleccioOrdinador.equals("%")) ||
                       (eleccioJugador.equals("#") && eleccioOrdinador.equals("@")) ||
                       (eleccioJugador.equals("%") && eleccioOrdinador.equals("#"))) {
                resultat = "Has guanyat!";
            } else {
                resultat = "Has perdut!";
            }

            System.out.println("Tu elecció: " + eleccioJugador + ", Ordinador: " + eleccioOrdinador + " - " + resultat);
            System.out.println("Introdueix la teva elecció (Pedra '@', Paper '#', Tisora '%' o 'END' per sortir):");
        } while (!eleccioJugador.equals("END"));

        sc.close();
    }
}
