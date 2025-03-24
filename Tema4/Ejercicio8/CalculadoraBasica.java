package Ejercicio8;

package Ejercicio8; // Paquete Ejercicio8

public class CalculadoraBasica {

    // Constructor privado para evitar instanciación
    private CalculadoraBasica() {
        throw new UnsupportedOperationException("Esta es una clase de utilidades y no debe instanciarse.");
    }

    // Métodos estáticos para las operaciones básicas
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }
}

