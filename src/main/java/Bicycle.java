// Subclass representing a Bicycle
class Bicycle extends Vehicle {
    public Bicycle(String brand, int year) {
        super(brand, year);
    }

    public void ringBell() {
        System.out.println("The " + getBrand() + " bicycle is ringing the bell.");
    }
}
