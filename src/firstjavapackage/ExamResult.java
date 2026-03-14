package firstjavapackage;

public class ExamResult {

    public boolean isPass(int marks) {

        /*if(marks >= 50) {
            return true;
        }

        return false; */

        return marks >= 50;
    }

    public static void main (String[] args) {
        ExamResult e = new ExamResult();
        System.out.println(e.isPass(40));
        System.out.println(e.isPass(69));
    }
}
