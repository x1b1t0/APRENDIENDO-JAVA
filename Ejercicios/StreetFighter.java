package Ejercicios;

//Por acabar

import java.util.Scanner;

public class StreetFighter {
    
    public static void main (String [] args) {
        
        Scanner sc = new Scanner(System.in);
        String estadoactual = sc.nextLine();
        String movimiento = sc.nextLine();

        if (estadoactual.equals("JUMPING")) {
            
            } else if movimiento.equals("TOUCH_FLOOR") {
            
            } else if (movimiento.equals("PUNCH_KEY")) {
            
            } else if (movimiento.equals("JOYSTICK_CENTER) {
            
            } else if (movimiento.equals("KICK_KEY")){

            
            }
            
        }
        
        if (movimiento.equals("IDLE JOYSTICK_UP")) {
            System.out.println("JUMPING");
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