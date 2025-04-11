public class Person {

    String name;
    int age;

    // Default constructor
    public Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person(); // calls default constructor
        Person p2 = new Person("Alice", 25); // calls parameterized constructor

        p1.display(); // Output: Name: Unknown, Age: 0
        p2.display(); // Output: Name: Alice, Age: 25
    }
}
