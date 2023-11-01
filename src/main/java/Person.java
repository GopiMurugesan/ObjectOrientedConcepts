/**
 * POJO to demonstrate Encapsulation
 * Description : Internal state of the Person class are well encapsulated using private access specifiers
 * and their access is controlled by getters and setters.
 * Encapsulation ensures internal state(i.e. data the person class stores) is not directly accessible
 * from outside class rather controlled and restrictive access is provided via methods inside it.
 */
public class Person {
    // Private instance variables (encapsulated)
    private String name;
    private int age;

    // Public constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
