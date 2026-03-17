package firstjavapackage.runner;

import firstjavapackage.MyNumber;

public class MyNumberRunner {

    public static void main (String[] arge) {

        MyNumber number = new MyNumber(2,3);
        System.out.println(number.add());
        System.out.println(number.multiply());
        number.doubleN1N2();
        System.out.println(number.getN1());
        System.out.println(number.getN2());

        MyNumber no = new MyNumber();

        no.isPerfectNumber(6);
        no.isPerfectNumber(28);
        no.isPerfectNumber(5);
        no.isPerfectNumber(0);
    }
}
