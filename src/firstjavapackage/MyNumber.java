package firstjavapackage;

import java.util.ArrayList;
import java.util.List;

public class MyNumber {

    private int n1=0, n2=0;

    //Constructor
    public MyNumber() {

    }

    public MyNumber(int n1, int n2) {
        setN1(n1);
        setN2((n2));
    }

    //getters and setters
    public int getN1() {

        return n1;
    }

    public void setN1(int n1) {

        this.n1 = n1;
    }

    public int getN2() {

        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    //Method to add n1 and n2
    public int add() {

        return n1 + n2;
    }

    //Method to multiply n1 and n2
    public int multiply() {

        return n1 * n2;
    }

    //Method to double n1 and n2
    public void doubleN1N2() {
        n1 = n1 * 2;
        n2 = n2 * 2;
    }

    public int getLastDigit(int number) {
        if (number == 0){
            return 0;
           }
        else if (number < 0){
            return -1;
        }
        else {
            return number % 10;
        }
    }

    public int getNumberOfDigits(int number) {
        if (number == 0){
            return 1;
        }
        else if (number < 0){
            return -1;
        }
        int digits = 0;
        int temp = number;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }
        return digits;
    }

    public int getSumOfDigits(int number) {
        if (number == 0){
            return 0;
        }
        else if (number < 0){
            return -1;
        }
        int sum = 0;
        int digit = 0;
        int temp = number;
        while (temp > 0) {
            digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }
        return sum;
    }

    public int reverseNumber(int number) {
        if (number == 0){
            return 0;
        }
        else if (number < 0){
            return -1;
        }
        int reverse = 0;
        int digit = 0;
        int temp = number;
        while (temp > 0) {
            digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        return reverse;
    }

    /**
     * This method returns all factors of a given number in an ArrayList.
     *
     * @param number the number to find factors of
     * @return a List of factors of the number
     */
    public List<Integer> determineAllFactors(int number) {

        // TODO: Write your code here
        int i;
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for(i=1; i<=number; i++) {
            if(number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    /**
     * This method generates a list of multiples of a given number less than a specified limit.
     *
     * @param number the number to find multiples of
     * @param limit the upper bound for the multiples
     * @return a List of multiples of the number less than the limit
     */
    public List<Integer> determineMultiples(int number, int limit) {

        // TODO: Write your code here

        if(number<=0 || limit <= 0) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> multiples = new ArrayList<Integer>();
        for (int i = number; i < limit; i += number) {
            multiples.add(i);
        }
        return multiples;
    }
}
