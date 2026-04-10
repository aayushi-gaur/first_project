package firstjavapackage;

public class PrimeNumber {

    //Method to check is a number is prime
    public void isPrime(int number) {

        if (number <= 1) {
            System.out.println("Number is not prime");
            return;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                System.out.println("Number is not prime");
                return;
            }
        }

        System.out.println("Number is prime");

    }
}
