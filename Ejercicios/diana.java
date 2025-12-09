package Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class diana {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            sc.useLocale(Locale.ENGLISH);
            double X = sc.nextDouble();
            double Y = sc.nextDouble();
            double dist = Math.sqrt(X * X + Y * Y);
            int score;
            if (dist < 5) {
                score = 5;
            } else if (dist < 10) {
                score = 4;
            } else if (dist < 15) {
                score = 3;
            } else if (dist < 20) {
                score = 2;
            } else {
                score = 1;
            }
            System.out.println(score);
        }
    }
}
// 5 punts al color groc, 4 al vermell, 3 al blau, 2 al negre i 1 al blanc.
