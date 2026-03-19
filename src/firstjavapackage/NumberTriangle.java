package firstjavapackage;

public class NumberTriangle {

    private int number=0;

    public NumberTriangle (int number) {
        this.number = number;
    }

    public void printNumberTriangle () {
        int i, j;
        for(i=1; i<=number; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
}
