package firstjavapackage;

public class SumOfDivisors {

    private int number=0;
    public SumOfDivisors(int number) {
        this.number = number;
    }
    //Method to print the sum of divisors of a number
    public int sumOfDivisors() {
        int i=1, sum=0;
        for(;i<number; i++) {
            if(number%i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
