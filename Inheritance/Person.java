package Inheritance;

public class Person {
    public String name;
    public String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void sayHello() {
        System.out.println("Hello from " + name + " " + lastName);
    }
}
