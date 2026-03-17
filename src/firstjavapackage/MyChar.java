package firstjavapackage;

import java.lang.reflect.Array;

public class MyChar {

    private char ch;

    //Constructor
    public MyChar(char ch) {

        this.ch = ch;
    }

    // Method to print lower case Alphabets
    public static void printLowerCaseAlphabets() {
        for (char c='a'; c<='z'; c++) {
            System.out.println(c);
        }
    }

    //Method to print Upper Case Alphabets
    public static void printUpperCaseAlphabets() {
        for (char c='A'; c<='Z'; c++) {
            System.out.println(c);
        }
    }

    //Method to check is the character is a vowel
    public boolean isVowel() {
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0; i<vowels.length; i++) {
            if (vowels[i] == ch) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the character is a consonant
    public boolean isConsonant() {
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0; i<vowels.length; i++) {
            if (vowels[i] != ch) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the character is a digit
    public boolean isDigit() {

        return ch >=48 && ch<=57;
    }

    // Method to check if the character is an alphabet
    public boolean isAlphabets() {

        return (ch>='a' && ch<='z') || (ch>='A' && ch<='Z');
    }
}
