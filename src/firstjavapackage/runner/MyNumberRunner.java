package firstjavapackage.runner;

import firstjavapackage.MyNumber;
import firstjavapackage.PerfectNumber;
import firstjavapackage.PrimeNumber;

public class MyNumberRunner {

    public static void main (String[] args) {

        MyNumber number = new MyNumber(2,3);
        System.out.println(number.add());
        System.out.println(number.multiply());
        number.doubleN1N2();
        System.out.println(number.getN1());
        System.out.println(number.getN2());

        //check if number is perfect
        PerfectNumber no = new PerfectNumber();

        no.isPerfectNumber(6);
        no.isPerfectNumber(28);
        no.isPerfectNumber(5);
        no.isPerfectNumber(0);

        //check if number is prime
        PrimeNumber noPrime = new PrimeNumber();
         noPrime.isPrime(7);
         noPrime.isPrime(10);
    }
}
