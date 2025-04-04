package Ejercicio6;

public class ComparaPorEdad {

    @Override
    public int compareTo(Persona otra) {
        return Integer.compare(this.edad, otra.edad);
    }
    }

