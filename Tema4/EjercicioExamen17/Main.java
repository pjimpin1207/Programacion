package EjercicioExamen17;

public class Main {
    public static void main(String[] args) {
        // Crear dos futbolistas con valores diferentes
        Futbolista futbolista1 = new Futbolista("Javier Ontiveros", 27, "Fútbol", "Delantero", 800);
        Futbolista futbolista2 = new Futbolista("Chris Ramos", 25, "Fútbol", "Delantero", 850);

        // Mostrar la información de los futbolistas
        System.out.println("Antes de modificar:");
        System.out.println(futbolista1);
        System.out.println(futbolista2);

        // Modificar valores de uno de los futbolistas usando setters
        futbolista1.setEdad(37);
        futbolista1.setGolesMarcados(810);

        // Anotar un gol
        futbolista1.anotarGol();

        System.out.println("\nDespués de modificar:");
        System.out.println(futbolista1);

        System.out.println("\n--------------------------------\n");

        // Probar EntrenamientoFutbol
        EntrenamientoFutbol entrenamiento = new EntrenamientoFutbol();
        entrenamiento.entrenar();
        entrenamiento.competir();

        System.out.println("\n--------------------------------\n");

        // Usar instanceof para verificar si un futbolista implementa Compite
        if (futbolista1 instanceof Compite) {
            System.out.println(futbolista1.getNombre() + " puede competir.");
        } else {
            System.out.println(futbolista1.getNombre() + " no puede competir.");
        }
    }
}