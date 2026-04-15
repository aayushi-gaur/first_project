package firstjavapackage.runner;

import firstjavapackage.Student;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class StudentRunner {

    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner scan = new Scanner(System.in);
        String name;
        Student student = new Student();
        //input marks and name

        System.out.print("Enter name of student: ");
        student.setName(scan.nextLine());

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = scan.nextInt();
        }
        student.setMarks(marks);

        System.out.println("Name of student: " + student.getName());
        System.out.println("Marks of student: " + Arrays.toString(student.getMarks()));

        int number = student.numberOfMarks();
        System.out.println("The number of subjects are:" + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("The total of marks obtained in all subjects are:" + sum);

        int maximumMarks = student.getMaximumMarks();
        System.out.println("The maximum marks obtained are:" + maximumMarks);

        int minimumMarks = student.getMinimumMarks();
        System.out.println("The minimum marks obtained are:" + minimumMarks);

        BigDecimal average = student.getAverageMarks();
        System.out.println("The average marks obtained are:" + average);
    }

}

