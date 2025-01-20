package tema4.ejercicio4;

public class Hora {

    private int hora;    // Atributo para la hora (0-23)
    private int minuto;  // Atributo para los minutos (0-59)
    private int segundo; // Atributo para los segundos (0-59)

    // Constructor
    public Hora(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // Métodos set
    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) 
            this.hora = hora;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) 
            this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60)
            this.segundo = segundo;
    }

    // Métodos get
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    // Incrementar un segundo
public void incrementarSegundo() {
    segundo++; // Incrementa la variable segundo en 1

    // Comprueba si los segundos han llegado a 60
    if (segundo == 60) {
        segundo = 0; // Reinicia los segundos a cero si se ha completado el minuto
        minuto++; // Incrementa la variable minuto cuando pasa un minuto

        // Comprueba si los minutos han llegado a 60.
        if (minuto == 60) {
            minuto = 0; // Reinicia los minutos a 0 cuando se completa una hora
            hora++; // Incrementa la variable hora cuando se completa la hora

            // Comprueba si las horas han llegado a 24.
            if (hora == 24) {
                hora = 0; // Reinicia las horas a 0cuando termina un día completo.
            }
        }
    }
}


    // Formatear la hora como cadena
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}

