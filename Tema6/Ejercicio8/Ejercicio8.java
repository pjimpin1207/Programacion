package Ejercicio8;

public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 300;

        if (a == 0) {
            throw new Exception("Se ha producido un error");
        }

        int resultado = b / a;
        System.out.println("Resultado: " + resultado);

        System.out.println("Programa finalizado");
    }
}
