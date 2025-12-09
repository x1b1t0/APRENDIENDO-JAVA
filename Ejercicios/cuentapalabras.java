package Ejercicios;

import java.util.Scanner;

public class cuentapalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creamos el scanner para leer la entrada
        int wordCount = 0; // Contador total de palabras

        // Leemos línea por línea hasta encontrar "END"
        while (true) {
            String line = sc.nextLine(); // Leemos una línea completa
            if (line.equals("END")) {    // Si la línea es "END", terminamos
                break;
            }

            // Si la línea no está vacía
            if (!line.isEmpty()) {
                // Dividimos la línea en palabras usando cualquier espacio como separador
                String[] words = line.trim().split("\\s+");
                wordCount += words.length; // Sumamos la cantidad de palabras de esta línea
            }
        }

        // Mostramos el número total de palabras
        System.out.println(wordCount);
    }
}



