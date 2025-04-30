/*package Ejercicio5;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private Integer edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    /*
    @Override
    public String compareTo(Persona otra) {
        return this.nombre.compareTo(otra.nombre);
    }


    @Override
    public int compareTo(Persona otra) {
        return Integer.compare(this.edad, otra.edad);
    }



    public static class ComparadorPorEdad implements java.util.Comparator<Persona> {
        @Override
        public int compare(Persona p1, Persona p2) {
            return Integer.compare(p1.getEdad(), p2.getEdad());
        }
    }

    public static class ComparadorPorNombreYEdad implements java.util.Comparator<Persona> {
        @Override
        public int compareTo(Persona otra) {
            int resultado;
            if (this.nombre.equals(otra.nombre)) {
                resultado = this.edad.compareTo(otra.edad);
            } else {
                resultado = this.nombre.compareTo(otra.nombre);
            }
            return resultado;
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
    }
}

*/