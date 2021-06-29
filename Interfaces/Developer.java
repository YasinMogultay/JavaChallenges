package Interfaces;


//Implemented by classes with the implements keyword.
//A class that implements an interface must provide an implementation for each method defined by the interface.
public class Developer implements WritesCode{
    @Override
    public Bug[] wrideCode(int numberOfLines) {
        return new Bug[0];
    }

    @Override
    public boolean debug(Bug bug) {
        return false;
    }

    @Override
    public void drinkCoffee() {

    }
}
