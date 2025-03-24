package Ejercicio17;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("ABC123", "Toyota", 2022, FuelType.GASOLINE, 4);
        Motorcycle moto1 = new Motorcycle("XYZ789", "Honda", 2021, FuelType.ELECTRIC, false);

        System.out.println(car1);
        System.out.println("Velocidad estimada: " + car1.calculateSpeed() + " km/h");
        System.out.println("Próximo mantenimiento: " + car1.getNextMaintenanceDate());

        System.out.println(moto1);
        System.out.println("Velocidad estimada: " + moto1.calculateSpeed() + " km/h");
        System.out.println("Próximo mantenimiento: " + moto1.getNextMaintenanceDate());

        System.out.println("Total de vehículos creados: " + Vehicle.getVehicleCount());
    }
}