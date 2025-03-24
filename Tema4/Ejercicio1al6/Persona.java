package Ejercicio1al6;

public class Persona {
    private String nombre;
    private int edad;
    private double estatura;
    private String apellido;

    // Constructor con parámetros (nombre, edad, estatura)
    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    // Constructor con solo nombre
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 18;
        this.estatura = 1.70;
    }

    // Constructor con nombre y apellido (concatena apellido al nombre)
    public Persona(String nombre, String apellido) {
        this.nombre = nombre + " " + apellido;
        this.edad = 18;
        this.estatura = 1.70;
    }

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        if (estatura >= 0) {
            this.estatura = estatura;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}