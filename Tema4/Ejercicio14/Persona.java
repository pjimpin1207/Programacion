package Ejercicio14;

public class Persona {
    protected String nombre;
    protected String telefono;
    protected String email;
    protected Direccion direccion;

    public Persona(String nombre, String telefono, String email, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}
