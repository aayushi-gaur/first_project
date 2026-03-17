package firstjavapackage.runner;

import firstjavapackage.ExamResult;

public class ExamResultRunner {

    public static void main (String[] args) {
        ExamResult e = new ExamResult();
        System.out.println(e.isPass(40));
        System.out.println(e.isPass(69));

        ExamResult er1 = new ExamResult(50);
        System.out.println(er1.assignGrade());

        ExamResult er2 = new ExamResult(40);
        System.out.println(er2.assignGrade());
    }

}
