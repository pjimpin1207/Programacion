package Ejercicio11;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "1234567890", 1605);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "0987654321", 1967);
        Libro libro3 = new Libro("El Quijote", "Miguel de Cervantes", "1234567890", 1605);


        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);


        System.out.println("libro1 es igual a libro3: " + libro1.equals(libro3)); // Debe ser true
        System.out.println("libro1 es igual a libro2: " + libro1.equals(libro2)); // Debe ser false
    }
}