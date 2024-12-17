
package tema3;

public class Ejercicio13 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {2, 5, 7};
        int[] array4 = {1, 4, 7, 8};

        System.out.println("¿array1 y array2 son iguales? " + compararArrays(array1, array2));
        System.out.println("¿array2 y array1 son iguales? " + compararArrays(array2, array1));
        System.out.println("¿array2 y array3 son iguales? " + compararArrays(array2, array3));
        System.out.println("¿array1 y array4 son iguales? " + compararArrays(array1, array4));

    }

 
    public static boolean compararArrays(int[] array1, int[] array2) {
        boolean resultado = true;
        // Comprobar longitud array
        if (array1.length != array2.length) {
            resultado = false;
        }

        // Comparar numero por numero
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                resultado = false; 
            }
        }

        return resultado;
    }
}