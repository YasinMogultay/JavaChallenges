package AbstractClasses;

public class Accountant extends Employee{
    public String work(){
        return "crunching numbers";
    }

    //We would use an abstract class when we want to force subclasses to provide a unique implementation for a method.
    public static void main(String[] args) {
        //ERROR !
//        Employee tim = new Employee();
        // OKAY
        Employee bob = new Accountant();
    }
}
