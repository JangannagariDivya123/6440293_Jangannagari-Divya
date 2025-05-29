class Vehicle {
    String make;
    String model;
    int  manufactureYear;

    Vehicle(String make, String model, int manufactureYear) {
        this.make = make;
        this.model = model;
        this.manufactureYear = manufactureYear;
    }

    void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + manufactureYear);
    }
}

public class VehicleDemo  {
    public static void main(String[] args) {
        Vehicle car1 = new  Vehicle("Toyota", "Camry", 2020);
        Vehicle car2 = new  Vehicle("Honda", "Civic", 2018);

        car1.displayDetails();
        car2.displayDetails();
    }
}
