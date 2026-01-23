        import java.util.Scanner;

        public class cajero {
            public static void main(String[] args) {
                try (Scanner scanner = new Scanner(System.in)) {
            
            double saldo = 1200.0;
            int opcion;

                    System.out.println("------------------------------:");
                    System.out.println("Elija una de las opciones:");
                    System.out.println("1. Depositar");
                    System.out.println("2. Retirar");
                    System.out.println("3. Consultar saldo");
                    System.out.println("4. Salir");
                    System.out.println("------------------------------:");
                    System.out.print("Opción: ");
                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese la cantidad a depositar: ");
                            double deposito = scanner.nextDouble();
                            saldo += deposito;
                            System.out.printf("Depósito exitoso. Nuevo saldo: %.2f €%n", saldo);
                            break;
                        case 2:
                            System.out.print("Ingrese la cantidad a retirar: ");
                            double retiro = scanner.nextDouble();
                            if (retiro <= saldo) {
                                saldo -= retiro;
                                System.out.printf("Retiro exitoso. Nuevo saldo: %.2f €%n", saldo);
                            } else {
                                System.out.println("Saldo insuficiente para realizar el retiro.");
                            }
                            break;
                        case 3:
                            System.out.printf("Su saldo actual es: %.2f €%n", saldo);
                            break;
                        case 4:
                            System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    }
            }
        }

        /*
        Funcionalidades básicas que el cajero debe ofrecer:
        1. Depositar dinero: Permitir al usuario ingresar una cantidad para aumentar el saldo.
        2. Retirar dinero: Permitir al usuario retirar una cantidad, verificando que haya saldo suficiente.
        3. Consultar saldo: Mostrar el saldo actual de la cuenta.
        4. Salir: Finalizar la operación del cajero.
        */
        }