package tema4.ejercicio5;

public class ContadorObjetos {
    // Atributo estático que cuenta el número de objetos creados
    private static int totalObjetos = 0;

    // Constructor para incrementar el contador estático
    public ContadorObjetos() {
        totalObjetos++;
    }

    // Método estático para mostrar el número total de objetos creados
    public static void mostrarTotalObjetos() {
        System.out.println("Número total de objetos creados: " + totalObjetos);
    }
}
