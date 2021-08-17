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


//iterate through the given an array of numbers if number is prime add it to array and return sorted array with prime numbers
function isPrime(arr){
    //an empty array to store prime numbers
    let primeNumbers = [];
    for (let i = 0; i < arr.length; i++) {
        //if it's prime push to primeNumbers Array
        if (checkPrime(arr[i])){
            primeNumbers.push(arr[i])
        }
    }
    //sorting array of prime numbers before returning
    primeNumbers.sort(function(a, b){return a-b});
    return primeNumbers;
}

//example
var arr = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16];
console.log(isPrime(arr));

