class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}
class Car extends Vehicle {
    void start() {  
        System.out.println("Car engine started");
    }
    void honk() {
        System.out.println("Car honks");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Vehicle v = new Car();  
        v.start();  
    }
}
