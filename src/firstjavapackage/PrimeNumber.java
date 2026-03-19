package firstjavapackage;

public class PrimeNumber {

    //Method to check is a number is prime
    public void isPrime(int number) {

        int i=1;

        for( ; i<number; i++){
            if (number % i == 0) {
                System.out.println("Number is not prime");
                return ;
            }
        }

        System.out.println("Number is prime");

    }
}
