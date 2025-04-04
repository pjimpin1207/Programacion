package Ejercicio6;

public class ComparadorApellido implements Comparable<Persona> {

    private String apellido;

    @Override
    public int compareTo(Persona otra) {
        return this.apellido.compareTo(otra.apellido);

    }


}