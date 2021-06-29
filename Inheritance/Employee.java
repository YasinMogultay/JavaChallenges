package Inheritance;

//Inheritance
//We can define classes that extend, or inherit from another class with the extends keyword in the class definition.
public class Employee extends Person{
    public String title;

    //The super keyword allows us to access a superclass's methods and constructors from within a subclass.
    public Employee(String name, String lastName, String title) {
        super(name, lastName);
        this.title = title;
    }

    //Overriding subclass must define a method with the same name, return type, and parameters as in the superclass.
    public void sayHello() {
        System.out.println("I'm an employee and overriding " + name +" "+ lastName);
    }

    public static void main(String[] args) {
        Person ben = new Person("Ben","Camp");
        ben.sayHello();
        Employee john = new Employee("john","doe","Student");
        john.sayHello();
        System.out.println(john.title);
        System.out.println(john.name);
        System.out.println(john.lastName);


    }
}
