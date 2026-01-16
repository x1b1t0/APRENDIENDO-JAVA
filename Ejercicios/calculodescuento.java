public class calculodescuento {
    public static void main(String[] args) {
        
        float[] precios = {50f, 49.99f, 25.45f};
        float[] descuentos = {10f, 21f, 17.89f};


        for (int i = 0; i < precios.length; i++) {
            float resultado = precios[i] * (1 - descuentos[i] / 100);
            System.out.println("Resultado " + (i + 1) + ": " + resultado);
        }
    }
}    
