package firstjavapackage.runner;

import firstjavapackage.BiNumber;

public class BiNumberRunner {

    public static void main (String[] arge) {

        BiNumber number = new BiNumber(2,3);
        System.out.println(number.add());
        System.out.println(number.multiply());
        number.doubleN1N2();
        System.out.println(number.getN1());
        System.out.println(number.getN2());
    }

}
