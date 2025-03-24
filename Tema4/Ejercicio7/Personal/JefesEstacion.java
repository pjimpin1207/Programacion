package Ejercicio7.Personal;

import java.time.LocalDateTime;

public class JefesEstacion {

    private String nombre;
    private String dni;
    private LocalDateTime FechaNomb;

    public JefesEstacion(String nombre, String dni, LocalDateTime FechaNomb) {
        this.nombre = nombre;
        this.dni = dni;
        this.FechaNomb = FechaNomb;
    }
}