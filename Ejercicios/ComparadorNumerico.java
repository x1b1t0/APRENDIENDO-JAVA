package Ejercicios;

import java.util.Scanner;

public class ComparadorNumerico {
    

    //Pide dos numeros y te tiene que decir cual es el mayor
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int n1 = sc.nextInt();
        System.out.println ("introduce el segundo numero: ");
        int n2 =sc.nextInt();

        if (n1>n2) {
            System.out.println ("n1 es mayor que n2");
        } else if (n2<n1) {
            System.out.println ("n2 es mayor que n1");
        } else {
            System.out.println ("n1 y n2 son iguales");       
        }
    }
}
