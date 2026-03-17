package firstjavapackage;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator {

    private int n1=0, n2=0, choice=0;
    Scanner scanner =new Scanner(System.in);

    //constructor
    //initialize numbers and choice
    public Calculator() {

        System.out.print("Enter Number1: ");
        n1 = scanner.nextInt();

        System.out.print("Enter Number2: ");
        n2 = scanner.nextInt();

        System.out.println("Menu: \n1. Add \n2. Subtract \n3. Multiple \n4. Divide \n5. Exit");
        System.out.print("Choose action: ");
        choice = scanner.nextInt();

    }

    //calculator
    public void calculateWithIf() {

        while (choice < 5) {
            if (choice == 1) {
                System.out.println("Sum of n1 and n2 = " + (n1 + n2));
            } else if (choice == 2) {
                System.out.println("Difference of n1 and n2 = " + (n1 - n2));
            } else if (choice == 3) {
                System.out.println("Product of n1 and n2 = " + (n1 * n2));
            } else if (choice == 4) {
                System.out.println("Dividend of n1 and n2 = " + (n1 / n2));
            }
            System.out.print("Choose action: ");
            choice = scanner.nextInt();
        }

        System.out.println("Thank You");
    }

    //calculator using switch
    public void calculatewithSwitch() {

        while(choice < 5) {

            switch (choice) {

                case 1:
                    System.out.println("Sum of n1 and n2 = " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Difference of n1 and n2 = " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Product of n1 and n2 = " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("Dividend of n1 and n2 = " + (n1 / n2));
                    break;
                case 5:
                    break;
            }

            System.out.print("Choose action: ");
            choice = scanner.nextInt();
        }

        System.out.println("Thank You");

    }

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

    //Understanding the BigDecimal class
    //Calculating Simple Interest
    private BigDecimal principal, rate;
    public Calculator(String principal, String rate) {
        this.principal = new BigDecimal(principal);
        this.rate = new BigDecimal(rate).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int noOfYears) {
        return principal.add(principal.multiply(rate).multiply(new BigDecimal(noOfYears)));
    }

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
