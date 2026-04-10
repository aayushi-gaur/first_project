package firstjavapackage;

import java.util.Scanner;

public class Calculator {

    private int n1=0, n2=0, choice=0;
    private final Scanner scanner =new Scanner(System.in);

    //constructor
    //initialize numbers and choice
    public Calculator() {

        System.out.print("Enter Number1: ");
        n1 = scanner.nextInt();

        System.out.print("Enter Number2: ");
        n2 = scanner.nextInt();

        System.out.println("Menu: \n1. Add \n2. Subtract \n3. Multiple \n4. Divide \n5. Factorial \n6. LCM \n7. GCD \n8. Exit");
        System.out.print("Choose action: ");
        choice = scanner.nextInt();

    }

    //calculator
    public void calculateWithIf() {

        while (choice != 8) {
            if (choice == 1) {
                System.out.println("Sum of n1 and n2 = " + sum(n1, n2));
            } else if (choice == 2) {
                System.out.println("Difference of n1 and n2 = " + diff(n1, n2));
            } else if (choice == 3) {
                System.out.println("Product of n1 and n2 = " + product(n1, n2));
            } else if (choice == 4) {
                if (n2 == 0) {
                    System.out.println("Cannot divide by zero!");
                } else {
                    System.out.println("Dividend of n1 and n2 = " + divisor(n1, n2));
                }
            }
            else if(choice == 5) {
                System.out.println("Factorial of n1 = " + calculateFactorial(n1));
                System.out.println("Factorial of n2 = " + calculateFactorial(n2));
            }
            else if(choice == 6) {
                System.out.println("LCM of n1 and n2 = " + calculateLCM());
            }
            else if(choice == 7) {
                System.out.println("GCD of n1 and n2 = " + calculateGCD());
            }
            else {
                System.out.println("Invalid choice");
            }
            System.out.print("Choose action: ");
            choice = scanner.nextInt();
        }

        System.out.println("Thank You");
    }

    //calculator using switch
    public void calculatewithSwitch() {

        while(choice != 8) {

            switch (choice) {

                case 1:
                    System.out.println("Sum of n1 and n2 = " + sum(n1, n2));
                    break;
                case 2:
                    System.out.println("Difference of n1 and n2 = " + diff(n1, n2));
                    break;
                case 3:
                    System.out.println("Product of n1 and n2 = " + product(n1, n2));
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("Cannot divide by zero!");
                    } else {
                        System.out.println("Dividend of n1 and n2 = " + divisor(n1, n2));
                    }
                    break;
                case 5:
                    System.out.println("Factorial of n1 = " + calculateFactorial(n1));
                    System.out.println("Factorial of n2 = " + calculateFactorial(n2));
                    break;
                case 6:
                    System.out.println("LCM of n1 and n2 = " + calculateLCM());
                    break;
                case 7:
                    System.out.println("GCD of n1 and n2 = " + calculateGCD());
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.print("Choose action: ");
            choice = scanner.nextInt();
        }

        System.out.println("Thank You");

    }

    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public int diff(int n1, int n2) {
        return n1 - n2;
    }

    public int product(int n1, int n2) {
        return n1 * n2;
    }

    public int divisor(int n1, int n2) {
        return n1 / n2;
    }

    public int calculateFactorial(int number) {
        int factorial=1, i;

        if (number < 0){
            return -1;
        }
        else if(number == 0 || number == 1) {
            return 1;
        }
        else {
            for(i=2; i<=number; i++) {
                factorial = product(factorial, i);
            }
            return factorial;
        }
    }

    public int calculateLCM() {
        int max = 0;
        int lcm = 0;
        if (n1 < 0 || n2 < 0) {
            return -1; // LCM is undefined for negative numbers
        }
        else if (n1 == 0 || n2 == 0) {
            return 0; // LCM of 0 and any other number is 0
        }
        max = Math.max(n1, n2);
        lcm = max;
        while (true){
            if(lcm % n1 == 0 && lcm % n2 == 0) {
                return lcm;
            }
            lcm = lcm + max;
        }
    }

    public int calculateGCD() {
        int min = Math.min(n1, n2);
        int gcd = min;
        if (n1 < 0 || n2 < 0) {
            return 1; // LCM is undefined for negative numbers
        }
        else if (n1 == 0 || n2 == 0) {
            return 0; // LCM of 0 and any other number is 0
        }
        for (gcd = min; gcd > 0; gcd--) {
            if (n1 % gcd == 0 && n2 % gcd == 0) {
                return gcd;
            }
        }
        return -1;
    }
}