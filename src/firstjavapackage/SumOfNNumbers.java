package firstjavapackage;

public class SumOfNNumbers {

    //Method to print sum of numbers upto N
    public void printSumUpToN(int N) {
        int i, sum=0;
        for (i=1; i <= N; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of numbers upto " + N + " is " + sum);
    }
}
