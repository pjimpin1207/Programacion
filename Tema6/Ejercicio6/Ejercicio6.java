package Ejercicio6;

public class Ejercicio6 {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            int resultado = b / a;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido un error");
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}