package Apuntes;

public class Bucles {
    // Aquí verás cómo utilizar bucles en Java

    public static void main(String[] args) {

       /*
    APUNTES DE CONDICIONALES EN JAVA
    --------------------------------

    Los condicionales permiten que un programa tome decisiones.
    En Java, las estructuras condicionales principales son:

    1) if
    2) if - else
    3) if - else if - else
    4) switch
*/

/*------------------------------------------------------------
    1) IF
    Se ejecuta una instrucción SOLO si la condición es verdadera.
-------------------------------------------------------------*/

if (edad >= 18) {
    System.out.println("Eres mayor de edad");
}

/*------------------------------------------------------------
    2) IF - ELSE
    Se ejecuta una acción si la condición es verdadera y otra si es falsa.
-------------------------------------------------------------*/

if (nota >= 5) {
    System.out.println("Aprobado");
} else {
    System.out.println("Suspendido");
}

/*------------------------------------------------------------
    3) IF - ELSE IF - ELSE
    Permite evaluar múltiples condiciones en orden.
-------------------------------------------------------------*/

if (dia == 1) {
    System.out.println("Lunes");
} else if (dia == 2) {
    System.out.println("Martes");
} else if (dia == 3) {
    System.out.println("Miércoles");
} else {
    System.out.println("Día no válido");
}

/*------------------------------------------------------------
    OPERADORES DE COMPARACIÓN (muy usados en condicionales)
    ---------------------------------------------------------
    ==   igual
    !=   distinto
    >    mayor
    <    menor
    >=   mayor o igual
    <=   menor o igual
-------------------------------------------------------------*/

/* Ejemplos */

if (x == 10) { … }
if (x != 5)  { … }
if (x > 7)   { … }

/*------------------------------------------------------------
    OPERADORES LÓGICOS (para unir varias condiciones)
    ---------------------------------------------------------
    &&    AND (y)
    ||    OR  (o)
    !     NOT (niega la condición)
-------------------------------------------------------------*/

/* Ejemplos */

if (edad >= 18 && edad <= 65) {
    System.out.println("Edad laboral");
}

if (dia == 6 || dia == 7) {
    System.out.println("Es fin de semana");
}

if (!llueve) {
    System.out.println("Puedes salir sin paraguas");
}

/*------------------------------------------------------------
    4) SWITCH
    Ideal cuando tienes muchas opciones según un mismo valor.
-------------------------------------------------------------*/

switch (opcion) {
    case 1:
        System.out.println("Has elegido 1");
        break;

    case 2:
        System.out.println("Has elegido 2");
        break;

    case 3:
        System.out.println("Has elegido 3");
        break;

    default:
        System.out.println("Opción no válida");
        break;
}

/*------------------------------------------------------------
    REGLAS IMPORTANTES
-------------------------------------------------------------
    - Las condiciones SIEMPRE deben dar como resultado true o false.
    - Los bloques se abren con { } (obligatorio si hay varias instrucciones).
    - En switch se usa "break" para evitar que siga ejecutando cases.
-------------------------------------------------------------*/

/*------------------------------------------------------------
    EJEMPLOS PRÁCTICOS
-------------------------------------------------------------*/

// Ejemplo 1
int numero = 7;

if (numero % 2 == 0) {
    System.out.println("Es par");
} else {
    System.out.println("Es impar");
}

// Ejemplo 2
String tipo = "Coche";

if (tipo.equals("Coche")) {
    System.out.println("Tiene 4 ruedas");
} else if (tipo.equals("Moto")) {
    System.out.println("Tiene 2 ruedas");
} else {
    System.out.println("Tipo desconocido");
}

// Ejemplo 3 con switch
char letra = 'A';

switch (letra) {
    case 'A':
        System.out.println("Has pulsado la A");
        break;

    case 'B':
        System.out.println("Has pulsado la B");
        break;

    default:
        System.out.println("Letra no reconocida");
        break;
}

/*
=============================================================
                    FIN DE LOS APUNTES
=============================================================
*/
