package Apuntes;

public class Condicionales {
// Apuntes resumidos de condicionales en Java con ejemplos sencillos
    public static void main(String[] args) {

        System.out.println("=== IF SIMPLE ===");
        int edad = 18;
        // Si la condición se cumple, entra aquí
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }

        System.out.println("\n=== IF ... ELSE ===");
        int nota = 6;
        // Si aprueba o no
        if (nota >= 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        System.out.println("\n=== IF ... ELSE IF ... ELSE ===");
        int nota2 = 8;
        // Varios rangos de notas
        if (nota2 < 5) {
            System.out.println("Suspenso");
        } else if (nota2 < 7) {
            System.out.println("Bien");
        } else if (nota2 < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }

        System.out.println("\n=== OPERADORES LOGICOS ===");
        boolean carnet = true;
        // AND y OR
        if (edad >= 18 && carnet) {
            System.out.println("Puede conducir");
        }
        if (edad < 18 || !carnet) {
            System.out.println("No puede conducir");
        }

        System.out.println("\n=== COMPARACION DE STRINGS ===");
        String color = "rojo";
        if (color.equals("rojo")) { // comparar Strings
            System.out.println("Es rojo");
        }
        if (!color.equals("azul")) {
            System.out.println("No es azul");
        }

        System.out.println("\n=== SWITCH ===");
        int dia = 3;
        switch(dia) { // elegir según valor
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
        }

        System.out.println("\n=== IF ANIDADOS ===");
        boolean tieneDinero = true;
        boolean tieneEntrada = false;
        if (tieneDinero) { // primero mira dinero
            if (tieneEntrada) { // luego entrada
                System.out.println("Puedes entrar al cine");
            } else {
                System.out.println("Compra entrada primero");
            }
        } else {
            System.out.println("No puedes entrar, no tienes dinero");
        }

        System.out.println("\n=== FIN DE LOS EJEMPLOS ===");
    }
}

