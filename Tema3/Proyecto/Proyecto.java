
package tema3;

import java.util.Scanner;

public class Proyecto {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matrices
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] suma = new int[2][2];
        int[][] producto = new int[2][2];

        // Rellenar matrices
        System.out.println("Introduce los elementos de la primera matriz (2x2):");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matriz1[i][j] = scanner.nextInt();

        System.out.println("Introduce los elementos de la segunda matriz (2x2):");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matriz2[i][j] = scanner.nextInt();

        // Calcular suma y producto
        for (int i = 0; i < 2; i++) { // Recorre las filas
            for (int j = 0; j < 2; j++) { // Recorre las columnas
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
                producto[i][j] = matriz1[i][0] * matriz2[0][j] + matriz1[i][1] * matriz2[1][j];
            }
        }

        // Mostrar resultados
        System.out.println("Suma de las matrices:");
        for (int[] fila : suma) // Reccore las filas de la matriz suma
            System.out.println(fila[0] + " " + fila[1]);

        System.out.println("Producto de las matrices:");
        for (int[] fila : producto) // Recorre las filas de la matriz de los productos
            System.out.println(fila[0] + " " + fila[1]);
    }
}