package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        // Crear un array de tipo Figura con 2 elementos
        Figura[] figuras = new Figura[2];

        // Agregar un Círculo y un Rectángulo al array
        figuras[0] = new Circulo(5.0);
        figuras[1] = new Rectangulo(4.0, 6.0);

        // Recorrer el array e imprimir la información de cada figura
        for (Figura figura : figuras) {
            figura.mostrarInformacion();
            System.out.println("----------------------");
        }
    }
}
