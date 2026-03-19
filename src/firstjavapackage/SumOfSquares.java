package firstjavapackage;

public class SumOfSquares{
    //Method to calculate sum of squares
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

    public void squareUpToLimit(int limit) {
        int i=1;
        while(i*i < limit){
            System.out.println(i*i);
            i++;
        }

    }
}
