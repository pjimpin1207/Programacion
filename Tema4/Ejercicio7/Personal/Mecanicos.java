package Ejercicio7.Personal;

public class Mecanicos {
    private String nombre;
    private int numero;
    private Especialidad especialidad;

    public Mecanicos (String nombre, int numero, Especialidad especialidad) {
        this.nombre = nombre;
        this.numero = numero;
        this.especialidad = especialidad;
    }
    public enum Especialidad {
        Frenos, Hidráulica, Electricidad, Motor
    }
}