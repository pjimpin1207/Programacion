package EjercicioAmpliacion;

public class CuentaCorriente {
    // Atributos de instancia
    protected String dni; // Visible dentro del paquete y subclases
    public String nombre; // Visible para cualquier clase
    private double saldo; // Visible solo dentro de esta clase
    private Gestor gestor; // Relación con un gestor

    // Constructor con DNI, nombre y saldo inicial
    public CuentaCorriente(String dni, String nombre, double saldoInicial) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = Math.max(0, saldoInicial);
        this.gestor = null; // La cuenta no tiene un gestor asignado inicialmente
    }

    // Métodos para gestionar el gestor
    public void asignarGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public Gestor getGestor() {
        return gestor;
    }

    // Métodos de instancia
    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han ingresado " + cantidad + "€. Saldo actual: " + saldo + "€.");
        } else {
            System.out.println("Cantidad inválida.");
        }
    }

    public boolean sacarDinero(double cantidad) {
        if (gestor != null && cantidad > gestor.getImporteMaximo()) {
            System.out.println("Operación no permitida: supera el importe máximo autorizado por el gestor.");
            return false;
        }

        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se han retirado " + cantidad + "€. Saldo restante: " + saldo + "€.");
            return true;
        } else {
            System.out.println("Operación fallida: saldo insuficiente o cantidad inválida.");
            return false;
        }
    }

    public void mostrarInformacion() {
        System.out.println("DNI del titular: " + dni);
        System.out.println("Nombre del titular: " + nombre);
        System.out.println("Saldo actual: " + saldo + "€.");
        if (gestor != null) {
            System.out.println("Gestor asignado: " + gestor.nombre + ", Teléfono: " + gestor.getTelefono());
        } else {
            System.out.println("No hay gestor asignado.");
        }
    }
}