package EjercicioAmpliacion;

import CuentaCorriente;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear cuentas corrientes
        CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", "Manuel Vizcaino", 500);
        CuentaCorriente cuenta2 = new CuentaCorriente("87654321B", "Sandra Sánchez", 1000);

        // Mostrar información de las cuentas y banco
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();

        // Cambiar el nombre del banco
        CuentaCorriente.setNombreBanco("Banco Santander");

        // Mostrar información actualizada
        System.out.println("\nDespués de cambiar el nombre del banco:");
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
    }
}
