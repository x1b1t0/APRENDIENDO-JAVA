package Apuntes;

public class Iteracions {
    // IteracionesJava.java
// Apuntes resumidos de bucles en Java con ejemplos sencillos

public class IteracionesJava {
    public static void main(String[] args) {

        System.out.println("=== BUCLE FOR ===");
        // Repetir un bloque un número fijo de veces
        for (int i = 1; i <= 5; i++) {
            System.out.println("For i = " + i);
        }

        System.out.println("\n=== BUCLE WHILE ===");
        // Repetir mientras la condición sea verdadera
        int j = 1;
        while (j <= 5) {
            System.out.println("While j = " + j);
            j++; // importante incrementar para no quedar en bucle infinito
        }

        System.out.println("\n=== BUCLE DO-WHILE ===");
        // Similar al while, pero siempre ejecuta al menos una vez
        int k = 1;
        do {
            System.out.println("Do-While k = " + k);
            k++;
        } while (k <= 5);

        System.out.println("\n=== BREAK ===");
        // Salir de un bucle antes de que termine
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                System.out.println("Rompo el bucle cuando i = " + i);
                break; // sale del bucle
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n=== CONTINUE ===");
        // Saltar a la siguiente iteración
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Salto la iteración i = " + i);
                continue; // va a la siguiente vuelta del bucle
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n=== BUCLE ANIDADO ===");
        // Un bucle dentro de otro
        for (int fila = 1; fila <= 3; fila++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print(fila * col + " ");
            }
            System.out.println(); // nueva línea por cada fila
        }

        System.out.println("\n=== FIN DE LOS EJEMPLOS DE ITERACIONES ===");
    }
}

}
