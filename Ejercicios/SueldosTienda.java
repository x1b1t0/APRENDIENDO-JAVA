import java.util.Scanner;

public class SueldosTienda {

    public static double calcularSueldo(int categoria) {
        switch (categoria) {
            case 1: // Reponedor
                double sueldoBase = 18890;
                return sueldoBase + (sueldoBase * 0.10);

            case 2: // Cajero
                return 25639.89;

            case 3: // Supervisor
                double sueldoBruto = 35560.20;
                return sueldoBruto - (sueldoBruto * 0.11);

            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Categorías:");
        System.out.println("1. Reponedor");
        System.out.println("2. Cajero");
        System.out.println("3. Supervisor");

        System.out.print("Ingrese la categoría del trabajador: ");
        int categoria = scanner.nextInt();

        double sueldo = calcularSueldo(categoria);

        if (sueldo != -1) {
            System.out.printf("El sueldo a transferir es: %.2f €%n", sueldo);
        } else {
            System.out.println("Categoría no válida.");
        }

        scanner.close();
    }
}