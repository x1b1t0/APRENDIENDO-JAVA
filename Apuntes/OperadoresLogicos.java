package Apuntes;
public class OperadoresLogicos {
    // Ejemplo de uso de operadores lógicos en Java
    public static void main(String[] args) {
        int edad = 25;
        boolean tieneLicencia = true;
        boolean puedeConducir = (edad >= 18) && tieneLicencia;
        System.out.println("¿Puede conducir? " + puedeConducir);

        boolean esEstudiante = false;
        boolean tieneDescuento = (edad < 18) || esEstudiante;
        System.out.println("¿Tiene descuento? " + tieneDescuento);

        boolean esMayorDeEdad = edad >= 18;
        boolean noEsEstudiante = !esEstudiante;
        System.out.println("¿Es mayor de edad y no es estudiante? " + (esMayorDeEdad && noEsEstudiante));
      }  
}
