package firstjavapackage.runner;

public class TriangleValidatorRunner {

    public static void main (String[] args) {

        boolean isValidTriangleFlag = new firstjavapackage.TriangleValidator().isValidTriangle(60, 60, 60);
        if (isValidTriangleFlag) {
            System.out.println("This is a valid triangle.");
        }
        else {
            System.out.println("Not a valid triangle");
        }
    }
}
