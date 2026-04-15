package firstjavapackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentArrayList {
    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public StudentArrayList() {
        name = null;
        this.marks = new ArrayList<>();

    }

    public StudentArrayList(String name, List<Integer> marks) {
        this.name = name;
        setMarks(new ArrayList<>(marks));
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getMarks() {
        return new ArrayList<>(marks);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(ArrayList<Integer> marks) {
        if (marks == null) {
            throw new IllegalArgumentException("marks cannot be null");
        }
        this.marks = new ArrayList<>(marks);
    }

    public int numberOfMarks() {
        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for(int mark: marks) {
            sum = sum + mark;
        }
        return sum;
    }

    public int getMaximumMarks() {
        if (marks.isEmpty()) {
            throw new IllegalStateException("No marks available");
        }
        return Collections.max(marks);
    }

    public int getMinimumMarks() {
        if (marks.isEmpty()) {
            throw new IllegalStateException("No marks available");
        }
        return Collections.min(marks);
    }

    public BigDecimal getAverageMarks() {
        if (marks.isEmpty()) {
            return BigDecimal.ZERO;
        }
        return BigDecimal.valueOf(getTotalSumOfMarks()).divide(BigDecimal.valueOf(numberOfMarks()), 2, RoundingMode.HALF_UP);
    }

    public void addMarks(int i) {
        marks.add(i);
    }

    public void removeMarksByIndex(int i) {
        marks.remove(i);
    }
}
