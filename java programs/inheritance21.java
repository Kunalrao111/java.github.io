
abstract class Vehicle {
    public abstract void startEngine();
    
    public abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }
    
    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started");
    }
    
    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }
}

public class inheritance21 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();
        
        Vehicle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}