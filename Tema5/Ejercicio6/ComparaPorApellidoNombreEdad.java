package Ejercicio6;

import java.util.Comparator;

public class ComparaPorApellidoNombreEdad implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        int compApellido = p1.getApellido().compareTo(p2.getApellido());
        if (compApellido != 0) return compApellido;

        int compNombre = p1.getNombre().compareTo(p2.getNombre());
        if (compNombre != 0) return compNombre;

        return Integer.compare(p1.getEdad(), p2.getEdad());
    }
}
