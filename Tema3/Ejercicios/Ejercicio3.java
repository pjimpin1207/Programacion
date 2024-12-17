/*Ejercicio 3
Crea una tabla como la de la imagen que representa los sueldos de los empleados de una empresa.
Auméntales el sueldo un 10% a cada empleado. Realiza la operación tanto con un for como con un foreach
 */
package tema3;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Crear tabla de sueldos
        double[] sueldos = {1800, 1200, 2000, 1200, 900};

        // Aumentar el sueldo un 10% con for
        double[] sueldosFor = sueldos.clone(); // Copiar el array original
        for (int i = 0; i < sueldosFor.length; i++) {
            sueldosFor[i] *= 1.10;
        }
        System.out.println("Sueldos con for:");
        imprimirArray(sueldosFor);

        // Aumentar el sueldo un 10% con foreach
        double[] sueldosForeach = sueldos.clone(); // Copiar el array original
        int index = 0;
        for (double sueldo : sueldos) {
            sueldosForeach[index] = sueldo * 1.10;
            index++;
        }
        System.out.println("Sueldos con foreach:");
        imprimirArray(sueldosForeach);
    }

    //Variable para imprimir resultados
    public static void imprimirArray(double[] array) {
        for (double valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

