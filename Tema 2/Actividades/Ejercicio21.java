// Pedir el número del mes en el año y decir cuántps días tiene este mes.
package tema2;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {

        // Crear objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir el número del mes
        System.out.print("Introduce el número del mes: ");
        int nummes = scanner.nextInt();

        // Pedir el año
        System.out.print("Introduce el año: ");
        int anno = scanner.nextInt();

        // Número de días del mes
        int dias = 0;

        // Verificar el número de días según el mes
        switch (nummes) {

            // Meses con 31 días: Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;

            // Meses con 30 días: Abril, Junio, Septiembre, Noviembre
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;

            // Febrero (28 o 29 días dependiendo del año)
            case 2:
                // Verificar si el año es bisiesto
                if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
                    dias = 29; // Año bisiesto
                } else {
                    dias = 28; // Año no bisiesto
                }
                break;

            // Si el mes no es válido
            default:
                System.out.println("Mes inválido.");
                return; // Salir del programa si el mes no es válido
        }

        // Mostrar el resultado
        if (dias > 0) {
            System.out.println("El mes " + nummes + " del año " + anno + " tiene " + dias + " días.");
        }
    }
}