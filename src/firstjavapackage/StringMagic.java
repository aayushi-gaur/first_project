package firstjavapackage;

public class StringMagic {
    /**
     * This method counts the number of uppercase letters in a given string.
     *
     * @param str The string to count uppercase letters in.
     * @return The number of uppercase letters in the string.
     */
    public int countUppercaseLetters(String str) {
        // TODO: Write your code here
        int i, count = 0;
        for(i=0; i<str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public void stringMethods() {
        String str = "This is a string";
/*
        //print substring from a start index before the end index
        System.out.println(str.substring(3,9));

        //print substring
        System.out.println(str.substring(3));

        System.out.println(str.indexOf("his"));

        System.out.println(str.lastIndexOf("s"));

        System.out.println(str.contains("a str"));

        System.out.println(str.startsWith("This"));

        System.out.println(str.endsWith("ing"));

        System.out.println(str.isEmpty());

        System.out.println(str.equals("This is a string"));

        System.out.println(str.equalsIgnoreCase("this is a string"));

        int i;

        for (i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }

 */
        str = str.concat(" and this is a concatenated string");
        System.out.println(str);

        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());

        String str2 = "   This is a string with leading and trailing spaces.   ";

        System.out.println(str2.trim());
    }

    /**
     * This method checks if a given string has two consecutive identical characters.
     *
     * @param str The string to check for consecutive duplicates.
     * @return true if the string has consecutive duplicates, false otherwise.
     */
    public boolean hasConsecutiveDuplicates(String str) {

        // TODO: Write your code here
        int i;
        if (str.isEmpty() || str.length() == 1) {
            return false;
        }
        for (i=0; i<str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
    public int getRightmostDigit(String str) {

        // TODO: Write your code here
        int i;
        if (str.isEmpty() ) {
            return -1;
        }
        for (i=str.length()-1; i>=0; i--) {
            if(Character.isDigit(str.charAt(i))) {
                return Character.getNumericValue(str.charAt(i));
            }
        }
        return -1;
    }
}