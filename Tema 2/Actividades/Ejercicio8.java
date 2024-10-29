/* ¿Cuánto vale cada una de estas expresiones?
  3<= 5 && 2 ==2
        3<=5 && 2>10
        1 ! =2 || 5< 3
        !(1<2)
*/
package tema2;

public class Ejercicio8 {

    public static void main(String[] args) {
       
        boolean res = (3  <= 5 && 2 == 2) ;
        System.out.println("Resultado: " + res);
       
        boolean res1 = (3 <= 5 && 2 > 10);
        System.out.println("Resultado: " + res1);
       
        boolean res2 = (1 != 2 || 5 < 3);
        System.out.println("Resultado: " + res2);
       
        boolean res3 = (!(1 < 2));
        System.out.println("Resultado: " + res3);
    }
}
