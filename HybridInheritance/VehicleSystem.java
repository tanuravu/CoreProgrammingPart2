package Inheritance.HybridInheritance;

// Superclass
class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface
interface Refuelable {
    void refuel();
}

// Subclass ElectricVehicle
class ElectricVehicle extends Vehicle {
    int batteryCapacity;

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println(model + " is charging with " + batteryCapacity + " kWh battery.");
    }
}

// Subclass PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelCapacity;

    PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling with " + fuelCapacity + " liters.");
    }
}

// Main Class
public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250, 100);
        PetrolVehicle pv = new PetrolVehicle("Honda Civic", 220, 50);

        ev.displayInfo();
        ev.charge();

        pv.displayInfo();
        pv.refuel();
    }
}
