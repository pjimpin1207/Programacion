
package tema2;

public class Ejercicio13 {

public static void main(String[] args) {
        int x  = 5;
        boolean resultado1 = 10 + 5 * 2 > 20 && 4 == 4;
        boolean resultado2 = !(7 + 3 >  10) || 3 * 2 <= 6;
        boolean resultado3 = 10 / 2 + 3 * 5 == 19 && true;
        boolean resultado4 = x + = 2 * 3;
        boolean b = false;
        resultado5= b=!b|| 7% 2 ==1;

        System.out.println("El resultado de la expresión es: " + resultado1);
        System.out.println("El resultado de la expresión es: " + resultado2);
        System.out.println("El resultado de la expresión es: " + resultado3);
        System.out.println("El resultado de la expresión es: " + resultado4);
        System.out.println("El resultado de la expresión es: " + resultado5);



    }
}