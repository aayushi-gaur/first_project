package firstjavapackage;

public class MultiplicationTable {



    //Method to print multiplication table
    // code duplication
   /* void printMultiplicationTable() {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
        }
    }

    void printMultiplicationTable(int N) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", N, i, N * i).println();
        }
    }*/

    public void printMultiplicationTable() {

        printMultiplicationTable(5);
    }

    public void printMultiplicationTable(int N) {

        printMultiplicationTable(N, 1,10);
    }

    public void printMultiplicationTable(int N, int from, int to) {
        int i;
        for (i = from; i <= to; i++) {
            System.out.printf("%d X %d = %d", N, i, N * i).println();
        }
    }
}
