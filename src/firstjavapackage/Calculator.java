package firstjavapackage;

import java.util.Scanner;

public class Calculator {

    private int n1=0, n2=0, choice=0;
    Scanner scanner =new Scanner(System.in);

    public Calculator() {

        System.out.print("Enter Number1: ");
        n1 = scanner.nextInt();

        System.out.print("Enter Number2: ");
        n2 = scanner.nextInt();

        System.out.println("Menu: \n1. Add \n2. Subtract \n3. Multiple \n4. Divide \n5. Exit");
        System.out.print("Choose action: ");
        choice = scanner.nextInt();

    }

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
}
