package EjercicioAmpliacion;

public class Gestor {
    public String nombre; // Visible para cualquier clase
    private final String telefono; // El teléfono es constante y no puede cambiar
    protected double importeMaximo; // Visible solo para clases vecinas

    // Constructor con nombre y teléfono, asignando un importe máximo por defecto
    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = 10000; // Importe máximo por defecto
    }

    // Constructor con nombre, teléfono y un importe máximo personalizado
    public Gestor(String nombre, String telefono, double importeMaximo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo > 0 ? importeMaximo : 10000; // Validación
    }

    // Método para obtener el teléfono
    public String getTelefono() {
        return telefono;
    }

    // Método para obtener el importe máximo
    protected double getImporteMaximo() {
        return importeMaximo;
    }
}