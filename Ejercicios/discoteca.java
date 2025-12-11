package Ejercicios;

public class discoteca {
    public static void main(String[] args) {
        int edad = 18; // Edad de la persona
        boolean tieneEntrada = true;// Si la persona tiene entrada

        // Comprobar si puede entrar a la discoteca
        if (edad >= 18 && tieneEntrada) {
            System.out.println("Puede entrar a la discoteca.");
        } else if (edad < 18) {
            System.out.println("No puede entrar: es menor de edad.");
        } else {
            System.out.println("No puede entrar: no tiene entrada.");
        }
    }
}
