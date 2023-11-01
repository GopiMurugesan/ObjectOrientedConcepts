/**
 * Abstraction allows to hide complex implementation details and shows only necessary details
 * Abstraction can be achieved by Abstract class or interface
 * In below example - we have two different shapes Rectangle and Circle both are subclass of abstract class Shape
 * Each shape has its own way of calculating area using different formulas.
 * User doesn't need to know the details about how the area is being calculated for each shapes
 * abstract class serves as abstraction layer which hides the implementation details and making
 * it easier to work with different shapes
 *
 * What purpose it serves
 * a) Code reusability - by creating abstract classes to define common behavior and later all the subclasses inherit the common behavior
 * b) Hiding complexity - hiding complexity of system and allows user to work on high level without worry about low level implementation
 * c) Enforcing standards - by defining common interface and abstract classes, you ensure classes that implements adhere to certain rules
 *
 *
 *
 *
 */
public class Abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // You don't need to know the internal details of each shape to calculate its area.
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }

}
