package firstjavapackage;

import java.util.Scanner;

public class SumOfCubes {

    public void cubeUpToLimit(int limit) {
        int i = 1;
        while (i * i * i < limit) {
            System.out.println(i * i * i);
            i++;
        }
    }

    public void cubePrint(){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        do {
            System.out.print(number * number * number);
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        } while (number > 0);
    }
}
