package Ejercicio10;

import java.io.Serializable;

public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "'}";
    }
}
