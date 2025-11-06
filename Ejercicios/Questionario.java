package Ejercicios;
import java.util.Scanner;

public class Questionario {
    public static void main(String[] args) {
        System.out.println("Benvingut al qüestionari!");

        Scanner newscanner = new Scanner(System.in);

        System.out.println("Com et dius?");
        String nom = newscanner.nextLine();
        System.out.println("Hola, benvingut al questionari " + nom + "!");

        System.out.println("Quin es el teu llenguatge de programacio preferit?");
        String resposta = newscanner.nextLine();
        System.out.println("Resposta: " + resposta);

        System.out.println("Quants anys tens?");
        int edat = newscanner.nextInt();
        System.out.println("Edat: " + edat);

        System.out.println("Ets home o dona (Indica amb H o D)?");
        char genere = newscanner.next().charAt(0);
        System.out.println("Genere: " + genere);

        if (genere == 'H' || genere == 'h') {
            System.out.println("Has indicat que ets home.");
        } else if (genere == 'D' || genere == 'd') {
            System.out.println("Has indicat que ets dona.");
        } else {
            System.out.println("Genere no reconegut.");
        }

        System.out.println("Gracies per participar al qüestionari!");

        newscanner.close();
    }
}
