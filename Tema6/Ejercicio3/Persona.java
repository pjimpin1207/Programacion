package Ejercicio3;

public class Persona {
    private int edad;

    public Persona(int edad) {
        setEdad(edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException(
                    "La edad no puede ser negativa: " + edad);
        }
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{edad=" + edad + "}";
    }
}
