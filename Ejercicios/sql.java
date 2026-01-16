import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class sql {
    public static void main(String[] args) {

        float a = 50;
        float b = 49.99f;
        float c = 25.45f;

        float d = 10;
        float e = 21;
        float f = 17.89f;

        float g = a * (1 - d / 100);
        float h = b * (1 - e / 100);
        float i = c * (1 - f / 100);

        System.out.println("G: " + g );
        System.out.println("H: " + h);
        System.out.println("I: " + i);

    }
}