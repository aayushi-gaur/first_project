package firstjavapackage;

import java.lang.reflect.Array;

public class MyChar {

    private char ch;
    public MyChar(char ch) {
        this.ch = ch;
    }

    public static void printLowerCaseAlphabets() {
        for (char c='a'; c<='z'; c++) {
            System.out.println(c);
        }
    }

    public static void printUpperCaseAlphabets() {
        for (char c='A'; c<='Z'; c++) {
            System.out.println(c);
        }
    }

    public boolean isVowel() {
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0; i<vowels.length; i++) {
            if (vowels[i] == ch) {
                return true;
            }
        }
        return false;
    }

    public boolean isDigit() {
        return ch >=48 && ch<=57;
    }

    public boolean isAlphabets() {
        return (ch>='a' && ch<='z') || (ch>='A' && ch<='Z');
    }
}
