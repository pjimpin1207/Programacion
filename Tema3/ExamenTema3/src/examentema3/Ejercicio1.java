/* Ejercicio 1

@param En el ejercicio primero he creado un array y tambien la suma de las posiciones impares
@return Nos devuelve la referrencia, el resultado de la suma y el contenido del array
*/

package examentema3;

public class Ejercicio1 {

    public static void main(String[] args) {
       
        int[] array1 = {5, 12, 7, 9, 3, 8};

        System.out.println("Referencia: " + array1);
        System.out.print("Array: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();
        int suma = 0;
        for (int i = 1; i < array1.length; i += 2) {
            suma += array1[i];
        }
        System.out.println("La suma de las posiciones impares es: " + suma);
    }
}
