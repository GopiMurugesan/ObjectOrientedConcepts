// Subclass representing a Car
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void honk() {
        System.out.println("The " + getBrand() + " car is honking.");
    }
}
