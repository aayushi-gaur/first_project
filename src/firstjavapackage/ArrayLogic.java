package firstjavapackage;

public class ArrayLogic {

    private int[] marks = {10,20,30,40,50,60,70,80};

    public ArrayLogic () {


    }

    public void printArray() {
        int i=0;
        for (i=0; i<marks.length; i++) {
            System.out.println(marks[i]);
        }
    }


    /**
     * This method determines whether there's an element greater than a given number in an array.
     *
     * @param array The array to search through.
     * @param number The number to compare with the array elements.
     * @return True if there's an element greater than the given number in the array, false otherwise.
     */
    public boolean doesHaveElementGreaterThan(int[] array, int number) {

        for(int a: array) {
            if(a > number ){
                return true;
            }
        }
        return false;
    }


    /**
     * This method finds and returns the second largest element in the given array.
     *
     * @param array the array in which to find the second largest element
     * @return the second largest element in the array
     */

    public int findSecondLargestElement(int[] array) {
        //TODO: Write your code here
        if (array.length < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int a : array){
            if(a > largest) {
                  secondLargest = largest;
                largest = a;
            }
            else if (a > secondLargest && a != largest) {
                secondLargest = a;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargest;
    }

    /**
     * This method checks if the input array is sorted in ascending order.
     *
     * @param array the array to check
     * @return true if the array is sorted, false otherwise
     */
    public boolean isSorted(int[] array) {
        if(array.length < 1) {
            return true;
        }
        for(int i = 0; i  < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method reverses an array.
     *
     * @param array the array to reverse
     * @return a new array with elements in reverse order
     */
    public int[] reverseArray(int[] array) {

        // TODO: Write your code here
        if(array.length < 1) {
            return array;
        }
        int[] reversedArray = new int[array.length];
        for(int i=0; i<array.length; i++) {
            reversedArray[array.length - 1 - i] = array[i];
        }
        return reversedArray;
    }
}
