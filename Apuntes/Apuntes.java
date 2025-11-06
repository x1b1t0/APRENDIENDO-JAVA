package Apuntes;
import java.util.Scanner; // Per llegir dades de l'usuari

class Main {
    public static void main(String[] args) {

        // ------------------------------
        // 1. CONCEPTES BÀSICS DE PROGRAMACIÓ
        // ------------------------------
        // Java és un llenguatge de programació estructurada i orientada a objectes.
        // Un programa és una sèrie d'instruccions que l'ordinador executa.
        System.out.println("Programa Java - Conceptes bàsics de programació");

        // ------------------------------
        // 2. LITERALS
        // ------------------------------
        int edat = 25;               // Literal enter
        double preu = 19.99;         // Literal decimal (double)
        char lletra = 'A';           // Literal caràcter
        boolean aprovat = true;      // Literal booleà
        String salutacio = "Hola";   // Literal String (text)

        System.out.println("\nLiterals:");
        System.out.println("Edat: " + edat);
        System.out.println("Preu: " + preu);
        System.out.println("Lletra: " + lletra);
        System.out.println("Aprovat: " + aprovat);
        System.out.println("Salutació: " + salutacio);

        // ------------------------------
        // 3. ESTRUCTURA BÀSICA D'UN PROGRAMA
        // ------------------------------
        // Tot programa Java té una classe i un mètode main
        // El main és el punt d'entrada del programa

        System.out.println("\nEstructura bàsica:");
        System.out.println("Classe Main amb mètode main i instruccions dins.");

        // ------------------------------
        // 4. VARIABLES I GESTIÓ DE MEMÒRIA
        // ------------------------------
        // Variables: espais de memòria amb nom i tipus
        int a = 10;          // enter
        double b = 3.14;     // decimal
        boolean c = true;    // booleà
        char d = 'Z';        // caràcter

        System.out.println("\nVariables:");
        System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", d: " + d);

        // ------------------------------
        // 5. LECTURA DE DADES
        // ------------------------------
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIntrodueix el teu nom: ");
        String nom = sc.nextLine();  // llegim un String
        System.out.print("Introdueix la teva edat: ");
        int edatUsuari = sc.nextInt(); // llegim un enter

        System.out.println("Hola " + nom + ", tens " + edatUsuari + " anys.");

        // ------------------------------
        // 6. OPERADORS ARITMÈTICS
        // ------------------------------
        int x = 15;
        int y = 4;

        System.out.println("\nOperadors aritmètics:");
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y)); // divisió d'enters
        System.out.println("x % y = " + (x % y)); // mòdul

        // ------------------------------
        // 7. OPERADORS LÒGICS
        // ------------------------------
        boolean cond1 = (x > y);
        boolean cond2 = (x == y);
        boolean resultat = cond1 && !cond2;

        System.out.println("\nOperadors lògics:");
        System.out.println("x > y: " + cond1);
        System.out.println("x == y: " + cond2);
        System.out.println("cond1 AND NOT cond2: " + resultat);

        // ------------------------------
        // 8. CONVERSIÓ DE TIPUS
        // ------------------------------
        double nota = 8.7;
        int notaEntera = (int) nota; // conversió explícita

        int num = 5;
        double numDouble = num;      // conversió implícita

        System.out.println("\nConversió de tipus:");
        System.out.println("Nota double: " + nota + " -> Nota int: " + notaEntera);
        System.out.println("Num int: " + num + " -> Num double: " + numDouble);

        sc.close(); // tanquem el Scanner
    }
}
