package Ejercicio18;

public class Bombilla {

    private boolean estado;


    public Bombilla() {
        this.estado = false;
    }

    public boolean getEstado() {
        return
    }

    public void encender() {
        this.estado = true;
    }

    public void apagar() {
        this.estado = false;
    }

    public boolean estaEncendida(boolean interruptorGeneral) {
        return estado && interruptorGeneral;
    }
}
