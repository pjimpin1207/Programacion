package tema4.ejercicio7;

import tema4.ejercicio7.maquinaria.Locomotoras;
import tema4.ejercicio7.maquinaria.Trenes;
import tema4.ejercicio7.personal.Maquinistas;
import tema4.ejercicio7.personal.Mecanicos;
import static tema4.ejercicio7.personal.Mecanicos.Especialidad.Frenos;

public class Ejercicio7 {
    public static void main(String[] args) {
// Crear un mecánico
        Mecanicos mecanico = new Mecanicos("Pablo Jiménez",647368837,Frenos);

        // Crear una locomotora con el mecánico asignado
        Locomotoras locomotora = new Locomotoras("Locomotora4", 7000, 2015, mecanico);

        // Crear un maquinista
        Maquinistas maquinista = new Maquinistas("Manuel Pérez", "12345678A", 2500, "Senior");

        // Crear un tren con la locomotora y el maquinista
        Trenes tren = new Trenes(locomotora, maquinista);

        // Mostrar información del tren
        System.out.println("Tren creado con éxito.");
    }
}