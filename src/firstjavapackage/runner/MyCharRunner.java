package firstjavapackage.runner;

import firstjavapackage.MyChar;

public class MyCharRunner {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('G');
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isDigit());
        System.out.println(myChar.isAlphabets());
        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();
        System.out.println(myChar.isConsonant());

    }
}
