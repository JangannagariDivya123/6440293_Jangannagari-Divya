class Vehicle {
    void makeSound() {
        System.out.println("Vehicle makes a sound");
    }
}

class Car extends Vehicle {
    @Override
    void makeSound() {
        System.out.println("Vroom");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle();
        Car myCar = new Car();

        genericVehicle.makeSound();
        myCar.makeSound();
    }
}
