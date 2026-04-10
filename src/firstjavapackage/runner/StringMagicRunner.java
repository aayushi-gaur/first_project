package firstjavapackage.runner;

public class StringRunner {

    public static void main(String[] args) {
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

}
