package EjercicioExamen17;

public class Futbolista extends Deportista {
    private String posicion;
    private int golesMarcados;

    public Futbolista(String nombre, int edad, String deporte, String posicion) {
        super(nombre, edad, deporte);
        this.posicion = posicion;
        this.golesMarcados = 0;
    }

    // Método para la anotación de goles
    public void anotarGol() {
        this.golesMarcados++;
    }

    // Getter y setters
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public int getGolesMarcados() {
        return golesMarcados;
    }

    // Sobrescribir toString
    @Override
    public String toString() {
        return super.toString() + ", Posición: " + posicion + ", Goles marcados: " + golesMarcados;
    }
}