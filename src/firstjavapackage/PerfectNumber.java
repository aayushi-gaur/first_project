package firstjavapackage;

public class PerfectNumber {

    //Method to calculate if number is perfect
    public void isPerfectNumber(int number) {

        int i=1, sum = 0;

        if (number <= 0) {
            System.out.println("Number is not perfect");
        }
        else {
            for (; i < number; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }

            if (sum == number) {
                System.out.println("Number is perfect");
            } else {
                System.out.println("Number is not perfect");
            }
        }
    }
}
