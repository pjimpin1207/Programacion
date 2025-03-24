package Ejercicio17;

abstract class Vehicle implements Maintenance {
    private String licensePlate;
    private String brand;
    private int year;
    private FuelType fuelType;
    private static int vehicleCount = 0; // Contador de vehículos

    public Vehicle(String licensePlate, String brand, int year, FuelType fuelType) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.year = year;
        this.fuelType = fuelType;
        vehicleCount++; // Incrementa el contador al crear un vehículo
    }

    public String getLicensePlate() { return licensePlate; }
    public void setLicensePlate(String licensePlate) { this.licensePlate = licensePlate; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public FuelType getFuelType() { return fuelType; }
    public void setFuelType(FuelType fuelType) { this.fuelType = fuelType; }

    public static int getVehicleCount() { return vehicleCount; }

    public abstract double calculateSpeed();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return licensePlate.equals(vehicle.licensePlate);
    }

    @Override
    public String toString() {
        return "Matrícula: " + licensePlate + ", Marca: " + brand + ", Año: " + year + ", Combustible: " + fuelType;
    }
}
