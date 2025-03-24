package Ejercicio17;

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String licensePlate, String brand, int year, FuelType fuelType, boolean hasSidecar) {
        super(licensePlate, brand, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() { return hasSidecar; }
    public void setSidecar(boolean hasSidecar) { this.hasSidecar = hasSidecar; }

    @Override
    public double calculateSpeed() {
        return 100.0; // Velocidad promedio en km/h
    }

    @Override
    public String getNextMaintenanceDate() {
        return "Cada 5,000 km o 6 meses";
    }

    @Override
    public String toString() {
        return super.toString() + ", Sidecar: " + (hasSidecar ? "Sí" : "No");
    }
}
