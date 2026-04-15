package firstjavapackage.runner;

import firstjavapackage.ArrayLogic;

public class ArrayLogicRunner {

    public static void main (String[] args) {
        ArrayLogic arrayLogic = new ArrayLogic();

        arrayLogic.printArray();

        arrayLogic.doesHaveElementGreaterThan(new int[]{1,2,3}, 2);

        arrayLogic.findSecondLargestElement(new int[]{1,2,3});

        arrayLogic.isSorted(new int[]{1,2,3});

        arrayLogic.reverseArray(new int[]{1,2,3});




    }
}
