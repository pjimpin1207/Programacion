package Ejercicio14;

public class Profesor extends Persona {
    private String departamento;

    public Profesor(String nombre, String telefono, String email, Direccion direccion, String departamento) {
        super(nombre, telefono, email, direccion);
        this.departamento = departamento;
    }
}
