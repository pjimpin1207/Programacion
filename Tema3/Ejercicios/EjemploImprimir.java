
package tema3;

public class EjemploImprimir {

    public static void main(String[] args) {
        int[] a   = {2,4,6,8,10};
        //Imprime la referencia
        System.out.println(a);
        //Imrpime el contenido
        for (int i = 0; i < a.length; i++)
        System.out.println(a[i]);
        //Imprime el contenido con for-each
        for (int e : a)
        System.err.println(e);
    }
}