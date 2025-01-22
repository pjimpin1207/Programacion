package tema4.ejercicio7.maquinaria;

import tema4.ejercicio7.personal.Maquinistas;
import java.util.ArrayList;
import java.util.List;

public class Trenes {

    private Locomotoras locomotora;
     private List <Vagones> vagones;
    private Maquinistas maquinista;
    private int numeroVagones;

    public Trenes(Locomotoras locomotora, Maquinistas maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        this.vagones = new ArrayList<>();
    }

    public boolean agregarVagon(Vagones vagon) {
        if (vagones.size() < 5) {
            vagones.add(vagon);
            return true;
        } else {
            return false;
        }
    }

    public boolean desengancharVagon(Vagones vagon) {
        if (vagones.size() > 0) {
            vagones.remove(vagon);
            return true;
        } else {
            return false;
        }
    }

    public List<Vagones> getNumeroVagones() {
        return vagones;
    }
}
