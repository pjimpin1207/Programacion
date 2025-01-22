package tema4.ejercicio7.maquinaria;

class Vagones {

    private int numVagon;
    private double cargaMaxima;
    private double cargaActual;
    private String mercancia;

    public Vagones(int numVagon, double cargaMaxima, double cargaActual, String mercancia) {
        this.numVagon = numVagon;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.mercancia = mercancia;
    }
}
