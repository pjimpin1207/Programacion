package Ejercicio17;

final class Car extends Vehicle {
    private int doors;

    public Car(String licensePlate, String brand, int year, FuelType fuelType, int doors) {
        super(licensePlate, brand, year, fuelType);
        this.doors = doors;
    }

    public int getDoors() { return doors; }
    public void setDoors(int doors) { this.doors = doors; }

    @Override
    public double calculateSpeed() {
        return 120.0;
    }

    @Override
    public String getNextMaintenanceDate() {
        return "Cada 10,000 km o 1 año";
    }

    @Override
    public String toString() {
        return super.toString() + ", Puertas: " + doors;
    }
}