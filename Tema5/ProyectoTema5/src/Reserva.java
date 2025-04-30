import java.time.LocalDateTime;

public class Reserva {
    //	Atributos
    private String nombreCliente;
    private int numeroComensales;
    private LocalDateTime fechaHora;

    //  Constructor:
    public Reserva(String nombreCliente, int numeroComensales, LocalDateTime fechaHora) {
        this.nombreCliente = nombreCliente;
        this.numeroComensales = numeroComensales;
        this.fechaHora = fechaHora;
    }

    //	Getters y setters:
    public String getNombreCliente() {
        return nombreCliente;
    }


    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }


    public int getNumeroComensales() {
        return numeroComensales;
    }


    public void setNumeroComensales(int numeroComensales) {
        this.numeroComensales = numeroComensales;
    }


    public LocalDateTime getFechaHora() {
        return fechaHora;
    }


    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }


    @Override
//	Metodo que devuelve el contenido en forma de texto.
//	Se sobrescribe debido a que es un metodo que ya existe en la superclase Object.
    public String toString() {
        return "Reserva{" +
                "cliente='" + nombreCliente + '\'' +
                ", comensales=" + numeroComensales +
                ", fechaHora=" + fechaHora +
                '}';
    }
}