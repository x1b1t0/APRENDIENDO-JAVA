package Apuntes;
import java.util.Scanner;

public class Bucles {
    // Aquí verás cómo utilizar bucles en Java

    public static void main(String[] args) {

        // 🔁 Bucle while
        // Explicación: El bucle while se utiliza cuando no sabes de antemano
        // cuántas iteraciones quieres realizar.
        // En este caso, imprimiremos los números del 1 al 5 utilizando un bucle while.
        System.out.println("Este es el bucle while:");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Aquest és el número (while): " + contador);
            contador++;
        }

        // 🔁 Bucle for
        // Explicación: El bucle for se utiliza cuando sabes de antemano cuántas
        // iteraciones quieres realizar.
        // En este caso, imprimiremos los números del 1 al 5 utilizando un bucle for.
        System.out.println("Este es el bucle for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Aquest és el número (for): " + i);
        }

        // 🔁 Bucle do-while
        // Explicación: El bucle do-while garantiza que el bloque de código se ejecuta
        // al menos una vez antes de evaluar la condición.
       System.out.println("Este es el bucle do-while:");
        int numero = 1;
        do {
            System.out.println("Aquest és el número (do-while): " + numero);
            numero++;
        } while (numero <= 5);

        // 🔁 Bucle foreach
        // Explicación: El bucle foreach se utiliza para iterar sobre elementos de una
        // colección o array.
        System.out.println("Este es el bucle foreach:");
        String[] noms = {"Anna", "Bernat", "Carla", "David", "Elena"};
        for (String nom : noms) {
            System.out.println("Nom: " + nom);
        }

        // 🔁 Condicional if
        // Explicación: Permite ejecutar diferentes bloques de código según una condición.
        System.out.println("Este es un ejemplo de condicional if:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quants anys tens? ");
        int edat = scanner.nextInt();

        if (edat < 18) {
            System.out.println("Ets menor d'edat.");
        } else {
            System.out.println("Ets major d'edat.");
        }

        scanner.close();
    }
}

