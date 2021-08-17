"use strict";
//this functions checks if the number is prime or not
function checkPrime(number) {
    //if number is less than 1 it's not a prime nubmer so return false
    if (number <= 1) {
        return false;
    } else {
        for (let i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
