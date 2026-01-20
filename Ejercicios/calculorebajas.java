import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class calculorebajas {
    public static void main(String[] args) {

        float g = descuento(50, 10);
        float h = descuento(49.99f, 21);
        float i = descuento(25.45f, 17.89f);

        System.out.println("G: " + g );
        System.out.println("H: " + h);
        System.out.println("I: " + i);

    }
    static float descuento(float precio, float porcentajeDescuento){
        return precio * (1 - porcentajeDescuento / 100);
    }
}