package firstjavapackage;

import java.util.Scanner;

public class TimeIfElse {

    private static int dayNumber = 0, monthNumber=0;
    static Scanner scanner =new Scanner(System.in);

    public static void determineNameOfDay() {

        System.out.print("Enter number of day: ");
        dayNumber = scanner.nextInt();

        switch(dayNumber) {
            case 0:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Thank You");
                break;
        }
    }

    public static void determineNameofMonth() {

        System.out.print("Enter number of month: ");
        monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 0:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Thank You");
                break;
        }

    }
    public static void isWeekDay() {

        System.out.print("Enter number of day: ");
        dayNumber = scanner.nextInt();

        if (dayNumber >=1 || dayNumber <= 5) {
            System.out.println("The day is a weekday");
        }
        else {
            System.out.println("The day is not a weekday");
        }

    }
}
