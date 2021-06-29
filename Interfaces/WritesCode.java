package Interfaces;
//Interfaces allow us to define the way that our objects interact with the rest of our application.

//all methods are public and abstract.
//all properties are public static and final.
//no static methods.
public interface WritesCode {
    Bug[] wrideCode(int numberOfLines);

    boolean debug(Bug bug);

    void drinkCoffee();


}
