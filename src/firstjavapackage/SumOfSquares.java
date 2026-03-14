package firstjavapackage;

public class SumOfSquares {
    public long calculateSumOfSquares(int n) {
        if  (n < 0) {
            return -1;
        }
        int i=0, sum=0;
        for (i=0; i <= n; i ++){
            sum = sum + (i*i);
        }
        return sum;
    }

    public static void main (String[] args) {
        SumOfSquares e = new SumOfSquares();
        System.out.println(e.calculateSumOfSquares(4));
        System.out.println(e.calculateSumOfSquares(-6));
    }
}
