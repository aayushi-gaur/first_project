package firstjavapackage.runner;

import firstjavapackage.RGBColor;

public class RGBColorRunner {

    public static void  main(String[] args) {

        RGBColor color = new RGBColor(100, 150, 200);
        System.out.println("Original Color:");
        System.out.println("Red: " + color.getRed());
        System.out.println("Green: " + color.getGreen());
        System.out.println("Blue: " + color.getBlue());
    }
}
