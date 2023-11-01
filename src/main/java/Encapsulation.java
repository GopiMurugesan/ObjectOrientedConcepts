public class Encapsulation {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", 30);

        // Access and modify object properties using getters and setters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setName("Bob");
        person.setAge(25);

        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
