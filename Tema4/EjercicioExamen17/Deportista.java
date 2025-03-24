package EjercicioExamen17;

public class Deportista {
    private String nombre;
    private int edad;
    private String deporte;

    private static int totalDeportistas = 0;

    public Deportista(String nombre, int edad, String deporte) {
        this.nombre = nombre;
        this.edad = edad;
        this.deporte = deporte;
        totalDeportistas++;
    }

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
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida.");
        }
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    // Método estático para obtener el total de deportistas
    public static int getTotalDeportistas() {
        return totalDeportistas;
    }

    // Método toString() para representar el objeto como cadena
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Deporte: " + deporte;
    }
}