import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//		Creamos un nuevo sistemas de reservas.
        SistemaReservas sistema = new SistemaReservas();

//		Añadimos reservas al sistema de reservas.
        sistema.agregarReserva(new Reserva("Juan", 2, LocalDateTime.of(2025, 4, 23, 13, 30)));
        sistema.agregarReserva(new Reserva("Ana", 4, LocalDateTime.of(2025, 4, 23, 14, 0)));
        sistema.agregarReserva(new Reserva("Luis", 3, LocalDateTime.of(2025, 4, 24, 13, 0)));
        sistema.agregarReserva(new Reserva("Ana", 4, LocalDateTime.of(2025, 4, 23, 15, 0)));

//		Mostrar reservas por dia:
        System.out.println("Reservas del 23 de abril:");
        List<Reserva> reservasHoy = sistema.consultarPorDia(LocalDate.of(2025, 4, 23));
        reservasHoy.forEach(System.out::println);

//		Mostrar reservas por comensales:
        System.out.println("\nReservas del 23 de abril ordenadas por número de comensales:");
        List<Reserva> ordenadas = sistema.consultarOrdenadasPorComensales(LocalDate.of(2025, 4, 23));
        ordenadas.forEach(System.out::println);
    }
}