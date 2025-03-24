package EjercicioAmpliacion;

import tema4.CuentaCorriente;
import tema4.Gestor;

public class PruebaGestorYCuenta {
    public static void main(String[] args) {
        // Crear un gestor
        Gestor gestor1 = new Gestor("Manuel Martínez", "123456789");
        Gestor gestor2 = new Gestor("Carlos Gonzalez", "987654321", 5000);

        // Crear cuentas corrientes
        CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", "Manuel Vizcaíno", 2000);
        CuentaCorriente cuenta2 = new CuentaCorriente("87654321B", "Sandra Pérez", 3000);

        // Asignar gestores a las cuentas
        cuenta1.asignarGestor(gestor1);
        cuenta2.asignarGestor(gestor2);

        // Mostrar información de las cuentas
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();

        // Intentar retirar dinero con restricciones del gestor
        System.out.println("\nIntentando retirar 6000€ de la cuenta 1:");
        cuenta1.sacarDinero(6000);

        System.out.println("\nIntentando retirar 3000€ de la cuenta 2:");
        cuenta2.sacarDinero(3000);
    }
}
