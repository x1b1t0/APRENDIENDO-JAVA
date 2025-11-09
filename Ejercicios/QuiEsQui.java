package Ejercicios;
import java.util.Scanner;

public class QuiEsQui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== QUIÉN ES QUIÉN ===");
        System.out.print("Introduce el género (H/M): ");
        String genero = sc.nextLine();
        System.out.print("Introduce el color de ojos: ");
        String ojos = sc.nextLine();
        System.out.print("Introduce el color de cabello: ");
        String pelo = sc.nextLine();

        String persona = "";
        
        // equalsIgnoreCase compara textos sin importar si están en mayúsculas o minúsculas.
        // Por ejemplo: "H" y "h" serían iguales.
        if (genero.equalsIgnoreCase("H") && ojos.equalsIgnoreCase("marrones") && pelo.equalsIgnoreCase("rubio")) {
            persona = "Luis";
        } else if (genero.equalsIgnoreCase("M") && ojos.equalsIgnoreCase("azules") && pelo.equalsIgnoreCase("moreno")) {
            persona = "Sara o Clara";
        } else if (genero.equalsIgnoreCase("H") && ojos.equalsIgnoreCase("verdes") && pelo.equalsIgnoreCase("moreno")) {
            persona = "Eduardo";
        } else if (genero.equalsIgnoreCase("H") && ojos.equalsIgnoreCase("marrones") && pelo.equalsIgnoreCase("castaño")) {
            persona = "Carlos";
        } else if (genero.equalsIgnoreCase("M") && ojos.equalsIgnoreCase("marrones") && pelo.equalsIgnoreCase("rubio")) {
            persona = "Vanesa";
        } else if (genero.equalsIgnoreCase("H") && ojos.equalsIgnoreCase("verdes") && pelo.equalsIgnoreCase("castaño")) {
            persona = "Juan";
        } else {
            persona = "No se ha encontrado a nadie con esas características.";
        }

        System.out.println("La persona es: " + persona);
        sc.close();
    }
}
