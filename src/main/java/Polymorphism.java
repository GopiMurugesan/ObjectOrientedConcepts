/**
 * Polymorphism allows objects of different class to be treated as object of base class or interface which allows
 * code to more flexible and looks simple
 * in the below example, we have created base class Animal with method 'makeSound()
 * Both the Dog and Cat class inherit from Animal class tne provide their own implementations of makeSound()
 * In the main class , we have created Array of Animal objects and filled wit instances of Dog and Cat.
 * So, when we loop through the array of animals, appropriate makeSound() will be called for each object.
 * this is the essense of polymorphism, same method name is being used to call different implementations based on object that acted upon them
 *
 *
 * Problem polymorphism solves
 * a) Simplified code  Provides common interface or base class to interact with different objects thereby reducing complex object creations and result in more simpler code
 * b) Flexibility - allows to add new subclass that extends base class or interface without need to modify existing code that uses this common interface which promotes code flexibility and easier to change
 *
 * Assume in the previous example if we don't declare base class Animal
 * Everytime when we work with multiple types of Animal, we need separate code(classes and methods)and leads to code duplication
 * if you need common operation that needs to be performed by all animals, then you need to touch all the animal class to add that method and ccode maintenance becomes cumbersome
 *
 */
public class Polymorphism {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Dog();

        for (Animal animal : animals) {
            animal.makeSound(); // Polymorphism - calls the appropriate makeSound() method for each object
        }
    }

}
