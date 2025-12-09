package Ejercicios;

//Por acabar

import java.util.Scanner;

public class StreetFighter {
    
    public static void main (String [] args) {
        
        Scanner sc = new Scanner(System.in);
       
        String estadoActual = sc.nextLine();  // Estado actual: IDLE, WALKING, JUMPING, PUNCHING, KICKING
        String evento = sc.nextLine();        // Evento: JOYSTICK_UP, JOYSTICK_LEFT/RIGHT, JOYSTICK_CENTER, PUNCH_KEY, KICK_KEY, PUNCH_END, KICK_END, TOUCH_FLOOR

        String nuevoEstado = estadoActual; // por defecto se queda igual

        // Comprobamos las transiciones según el estado actual
        switch (estadoActual) {
            case "IDLE":
                if (evento.equals("JOYSTICK_UP")) {
                    nuevoEstado = "JUMPING";
                } else if (evento.equals("JOYSTICK_LEFT/RIGHT")) {
                    nuevoEstado = "WALKING";
                } else if (evento.equals("PUNCH_KEY")) {
                    nuevoEstado = "PUNCHING";
                } else if (evento.equals("KICK_KEY")) {
                    nuevoEstado = "KICKING";
                }
                break;

            case "WALKING":
                if (evento.equals("JOYSTICK_UP")) {
                    nuevoEstado = "JUMPING";
                } else if (evento.equals("JOYSTICK_CENTER")) {
                    nuevoEstado = "IDLE";
                } else if (evento.equals("PUNCH_KEY")) {
                    nuevoEstado = "PUNCHING";
                } else if (evento.equals("KICK_KEY")) {
                    nuevoEstado = "KICKING";
                }
                break;

            case "JUMPING":
                if (evento.equals("TOUCH_FLOOR")) {
                    nuevoEstado = "IDLE";
                }
                break;

            case "PUNCHING":
                if (evento.equals("PUNCH_END")) {
                    nuevoEstado = "IDLE";
                }
                break;

            case "KICKING":
                if (evento.equals("KICK_END")) {
                    nuevoEstado = "IDLE";
                }
                break;

            default:
                // si el estado no es reconocido, se queda igual
                break;
        }

        // Mostramos el estado final después del evento
        System.out.println(nuevoEstado);
    }
}