package Ejercicios;

import java.util.Scanner;

public class StreetFighter {
    
    public static void main (String [] args) {
        
        Scanner sc = new Scanner(System.in);
        string estadoactual = nextLine(),next();
        String movimiento = sc.nextLine().next();


        
        if (movimiento.equals("IDLE JOYSTICK_UP")) {
            System.out.println("IDLE");
        } else if (movimiento.equals("IDLE JOYSTICK_LEFT/RIGHT")) {
            System.out.println("WALKING");
        } else if (movimiento.equals("IDLE JOYSTICK_CENTER")) {
            System.out.println("IDLE");
        } else if (movimiento.equals("IDLE PUNCH_KEY")) {
            System.out.println("PUNCHING");
        } else if (movimiento.equals("IDLE KICK_KEY")) {
            System.out.println("KICKING");
        }
    }
}