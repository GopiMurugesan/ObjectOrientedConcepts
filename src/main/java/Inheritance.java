/**
 * Inheritance allows subclasses to inherit the attributes and behaviors of parent class
 * IS-A relationship
 * In below example, we have base class Vehicle has common attributes for all the vehicles(brand and year)
 * and methods for starting and stopping the vehicle
 * We have two subclasses Car and Bicycle - Car can add additional attribute numberOfDoors and method honk()
 * Bicycle can add ringBell() apart from the common attributes and methods hat they inherit from base class
 *
 * Main purpose of Inheritance is to avoid code duplicaton and organizing the classes in more hierarchical way
 *
 */
public class Inheritance {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 4);
        Bicycle myBicycle = new Bicycle("Schwinn", 2020);

        myCar.start();
        myCar.honk();
        myCar.stop();

        myBicycle.start();
        myBicycle.ringBell();
        myBicycle.stop();
    }
}
