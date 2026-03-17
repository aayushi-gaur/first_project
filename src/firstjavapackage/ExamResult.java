package firstjavapackage;

public class ExamResult {

    public boolean isPass(int marks) {

        /*if(marks >= 50) {
            return true;
        }

        return false; */

        return marks >= 50;
    }

    private int marks;

    public ExamResult() {

    }

    public ExamResult(int marks) {
        this.marks = marks;
    }

    public char assignGrade() {
        // TODO: Implement the method which assigns the grade based on marks.
        if(marks < 0 || marks > 100) {
            return 'X';
        }
        else if(marks >= 90) {
            return 'A';
        }
        else if(marks >= 80) {
            return 'B';
        }
        else if(marks >= 70) {
            return 'C';
        }
        else if(marks >= 60) {
            return 'D';
        }
        else if(marks >= 50) {
            return 'E';
        }
        else {
            return 'F';
        }

    }


}
