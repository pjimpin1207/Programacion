import java.util.Comparator;

public class ComparadorPorComensales implements Comparator<Reserva> {

    @Override
    /**
     * Metodo que realiza comparacion entre dos reservas por numero de comensales
     */
    public int compare(Reserva r1, Reserva r2) {
        return Integer.compare(r1.getNumeroComensales(), r2.getNumeroComensales());
    }
}