
package tema3;

import java.util.Arrays;

public class Ejercicio9 {

    public static void main(String[] args) {
        // Inicializar la matriz
        int[] e = {1,2,3,4};
        System.out.println(e);
        System.out.println(Arrays.toString(e));
        char[][] matriz = {
            {'A', 'B', 'C'},
            {'D', 'E', 'F'},
            {'G', 'H', 'I'}
        };
        

        // Recorrer y imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}

