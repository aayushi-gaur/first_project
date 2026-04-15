package firstjavapackage.runner;

import firstjavapackage.BiArray;

public class BiArrayRunner {

    public static void main (String[] args) {
        BiArray biArray = new BiArray(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        System.out.println(biArray.areSumsEqual());

    }
}
