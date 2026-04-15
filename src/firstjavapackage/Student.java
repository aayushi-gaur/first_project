package firstjavapackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {

    private String name;
    private int[] marks = new int[5];

    public Student() {
        name = "";
        marks = new int[]{0, 0, 0, 0, 0};
    }

    public Student(String name, int[] marks) {
        this.name = name;
        setMarks(marks);
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return Arrays.copyOf(marks, marks.length);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        if (marks == null) {
            throw new IllegalArgumentException("marks cannot be null");
        }
        this.marks = Arrays.copyOf(marks, marks.length);
    }

    public int numberOfMarks() {
        return marks.length;
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for(int mark: marks) {
            sum = sum + mark;
        }
        return sum;
    }

    public int getMaximumMarks() {
        if (marks.length == 0) {
            throw new IllegalStateException("No marks available");
        }
        int max = marks[0];
        for (int mark: marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    public int getMinimumMarks() {
        if (marks.length == 0) {
            throw new IllegalStateException("No marks available");
        }
        int min = marks[0];
        for (int mark: marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    public BigDecimal getAverageMarks() {
        if (marks.length == 0) {
            return BigDecimal.ZERO;
        }
        return BigDecimal.valueOf(getTotalSumOfMarks()).divide(BigDecimal.valueOf(numberOfMarks()), 2, RoundingMode.HALF_UP);
    }
}
