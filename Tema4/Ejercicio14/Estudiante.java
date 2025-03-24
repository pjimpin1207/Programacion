package Ejercicio14;

public class Estudiante extends Persona {
    private String carnetId;
    private double notaMedia;

    public Estudiante(String nombre, String telefono, String email, Direccion direccion, String carnetId, double notaMedia) {
        super(nombre, telefono, email, direccion);
        this.carnetId = carnetId;
        this.notaMedia = notaMedia;
    }

    public boolean esMatriculaHonor() {
        return notaMedia >= 9.0;
    }
}
