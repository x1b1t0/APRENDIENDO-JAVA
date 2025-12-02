package Ejercicios;
import java.util.Scanner;

public class Divisiblespertres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        for (int i = A; i <= B; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
