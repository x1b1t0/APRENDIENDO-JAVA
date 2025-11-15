package Ejercicios;

import java.util.Scanner;

public class Parquing {

    public static void main(String[] args) {

        String matricula;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la matricula del coche: ");
        matricula = sc.nextLine();

        String TipusVehicle;
        System.out.println("Introduce el tipo de vehiculo (Coche/Moto): ");
        TipusVehicle = sc.nextLine();

        //Ahora hara falta poner los tipos de estacionamiento y las tarifas, dependiendo si es coche o moto

        // Coche

        // Tipus A) Per hora, el valor de la qual és de 3€ per hora
        // Tipus B) Mitja jornada (8 hores), el valor total de la qual és de 15€ i posseeix un 5% de descompte.
        // Tipus C) Jornada completa (16 hores), el valor total de la qual és de 30€ i té un 5% de descompte

        // Moto
        // Tipus A) Per hora, el valor de la qual és de 1€ per hora
        // Tipus B) Mitja jornada (8 hores), el valor total de la qual és de 5€
        // Tipus C) Jornada completa (16 hores), el valor total de la qual és de 10€
  
        String TiposEstacionamiento;
        System.out.println("Introduce el tipo de estacionamiento (A/B/C): ");
        TiposEstacionamiento = sc.nextLine();

        if (TipusVehicle.equals("Coche")) {
            if (TiposEstacionamiento.equals("A"))
                System.out.println("El precio es de 3€ por hora");
            else if (TiposEstacionamiento.equals("B"))
                // 15€ con 5% de descuento
                total = 15 - (15 * 0.05);
                System.out.println("El precio final (con 5% de descuento) es de: " + total + "€");
            else if (TiposEstacionamiento.equals("C"))
                // 30€ con 5% de descuento
               total = 30 - (30 * 0.05);
                System.out.println("El precio final (con 5% de descuento) es de: " + total + "€");
            else
                System.out.println("Tipo de estacionamiento no válido");
        }

        if (TipusVehicle.equals("Moto")) {
            if (TiposEstacionamiento.equals("A"))
                System.out.println("El precio es de 1€ por hora");
            else if (TiposEstacionamiento.equals("B"))
                System.out.println("El precio es de 5€");
            else if (TiposEstacionamiento.equals("C"))
                System.out.println("El precio es de 10€");
            else
                System.out.println("Tipo de estacionamiento no válido");
        }

        sc.close();
    }
}
