package Polymorphism;

class PolymorphismDemo {
    public static void doWork(Employee e) {
        System.out.println(e.work());
    }

    public static void main(String[] args) {
        //Polymorphism is a feature of inheritance that allows us to treat objects of different subclasses that have the
        //same superclass as if they were of the superclass type.
        Employee one = new Employee();
        Employee two = new Manager();

        doWork(one); // "Filling out forms"
        doWork(two); // "Managing employees"
    }

}