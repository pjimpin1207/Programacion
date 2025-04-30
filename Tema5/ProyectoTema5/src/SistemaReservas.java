import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Nos poermite gestionar las reservas.
public class SistemaReservas {
    //	Atributos:
    List<Reserva> reservas = new ArrayList<>();
    Map<LocalDate, List<Reserva>> reservasPorDia = new HashMap<>();

    /**
     * Método que permite agregar reservas.
     * @param r reserva a añadir.
     */
    public void agregarReserva (Reserva r) {
        reservas.add(r);
        LocalDate dia = r.getFechaHora().toLocalDate();
//		A la hora de incluir la reserva en el mapa, si no existen reservas ese día 
//		crea una lista nueva vacía.
        reservasPorDia.computeIfAbsent(dia, k -> new ArrayList<>()).add(r);
    }

    /**
     * Método que permite consultar reservas por dias
     * @param dia. Será el día que queremos consultar las reservas
     * @return una lista con las reservas de ese día en concreto
     */
    public List<Reserva> consultarPorDia(LocalDate dia){
        return reservasPorDia.getOrDefault(dia, new ArrayList<>());
    }

    /**
     * Método que permite consultar las reservas por comensales.
     * @param dia. Será el día que queremos consultar las reservas
     * @return una lista ordenada por número de comensales (Para ello usa la clase Comparador Comensales)
     */
    public List<Reserva> consultarOrdenadasPorComensales(LocalDate dia){
        List<Reserva> lista = new ArrayList<>(consultarPorDia(dia));
        lista.sort(new ComparadorPorComensales());
        return lista;
    }
}