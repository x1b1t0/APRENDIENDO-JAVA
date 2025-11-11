package Ejercicios;

import java.util.Scanner;

public class Hora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia = sc.nextLine().trim();

        // Convertim a minúscules per comparar sense problemes
        dia = dia.toLowerCase();

        if (dia.equals("dilluns") || dia.equals("dimarts") || dia.equals("dimecres")
                || dia.equals("dijous") || dia.equals("divendres")) {
            System.out.println("8:00");
        } else if (dia.equals("dissabte") || dia.equals("diumenge")) {
            System.out.println("10:00");
        }

        sc.close();
    }
}