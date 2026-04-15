package firstjavapackage.runner;

import firstjavapackage.StringMagic;

public class StringMagicRunner {

    public static void main(String[] args) {
        String str = "TeSt";
        StringMagic stringMagic = new StringMagic();
        System.out.println(stringMagic.countUppercaseLetters(str));

        System.out.println(stringMagic.hasConsecutiveDuplicates("helo"));

        System.out.println(stringMagic.getRightMostDigit("-12345"));

        stringMagic.dayOfTheWeekArray();
    }

}
