package Ejercicio14;

public class Main {
    public static void main(String[] args) {
        // Crear dirección
        Direccion direccion1 = new Direccion("Calle 123", "Madrid", "Madrid", "28001", "España");

        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Juan Pérez", "600123456", "juan@email.com", direccion1, "E12345", 9.5);

        // Crear un profesor
        Profesor profesor = new Profesor("María López", "601987654", "maria@email.com", direccion1, "Matemáticas");

        // Mostrar información y acciones
        estudiante.saludar();
        System.out.println("¿Es matrícula de honor?: " + estudiante.esMatriculaHonor());

        profesor.saludar();
        direccion1.imprimir();
    }
}
