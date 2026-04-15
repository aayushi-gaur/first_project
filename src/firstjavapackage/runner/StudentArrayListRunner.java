package firstjavapackage.runner;

import firstjavapackage.StudentArrayList;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayListRunner {

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        StudentArrayList student = new StudentArrayList();
        //input marks and name

        System.out.print("Enter name of student: ");
        student.setName(scan.nextLine());

        System.out.print("Enter number of marks: ");
        int numMarks = scan.nextInt();

        for (int i = 0; i < numMarks; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks.add(scan.nextInt());
        }
        student.setMarks(new ArrayList<>(marks));

        System.out.println("Name of student: " + student.getName());
        System.out.println("Marks of student: " + student.getMarks());

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

        student.addMarks(60);
        System.out.println("Marks of student: " + student.getMarks());

        student.removeMarksByIndex(3);
        System.out.println("Marks of student: " + student.getMarks());
    }
}
