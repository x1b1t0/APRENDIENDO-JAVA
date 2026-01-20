public class Nomina {
    public static void main(String[] args) {
        double tasaImpuesto = 0.15;
        
        calcularYMostrarNomina("Juan Pérez", 160, 15.50, tasaImpuesto);
        calcularYMostrarNomina("María López", 175, 18.00, tasaImpuesto);
        calcularYMostrarNomina("Carlos Ruiz", 150, 14.00, tasaImpuesto);
    }
    
    static void calcularYMostrarNomina(String nombre, int horasTrabajadas, double tarifaHora, double tasaImpuesto) {
        double bruto;
        
        if (horasTrabajadas > 160) {
            int extras = horasTrabajadas - 160;
            bruto = (160 * tarifaHora) + (extras * (tarifaHora * 1.5));
        } else {
            bruto = horasTrabajadas * tarifaHora;
        }
        
        double impuesto = bruto * tasaImpuesto;
        double neto = bruto - impuesto;
        
        System.out.println("--------------------------------");
        System.out.println("RECIBO DE SUELDO");
        System.out.println("Empleado: " + nombre);
        System.out.println("Horas: " + horasTrabajadas);
        System.out.println("Bruto: " + bruto + " €");
        System.out.println("Impuestos: -" + impuesto + " €");
        System.out.println("TOTAL A PAGAR: " + neto + " €");
        System.out.println("--------------------------------");
        System.out.println();  // Línea en blanco para separar recibos
    }
} 