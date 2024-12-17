/*Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras.
Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos) de cada semestre para cada fruta.
La aplicación mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado en 2,35 € y el kilo de peras en 1,95 €.
*/
package tema2;

import java.util.Scanner;

public class Ejercicio10 {


    public static void main(String[] args) {
    
        final double precioManzanas = 2.35;
        final double precioPeras = 1.95;

        Scanner scanner = new Scanner(System.in);
        
        double totalManzanas = 0;
        double totalPeras = 0;

        for (int semestre = 1; semestre <= 2; semestre++) {
            System.out.print("Introduzca las ventas de manzanas en kg del semestre " + semestre + ": ");
            double kilosManzanas = scanner.nextDouble();
            totalManzanas += kilosManzanas;

            System.out.print("Introduzca las ventas de peras en kg del semestre " + semestre + ": ");
            double kilosPeras = scanner.nextDouble();
            totalPeras += kilosPeras;
        }

        double beneficioManzanas = totalManzanas * precioManzanas;
        double beneficioPeras = totalPeras * precioPeras;
        double beneficioTotal = beneficioManzanas + beneficioPeras;
        
        System.out.printf("Beneficio total : %.2f €%n", beneficioTotal);


    }
    
}
