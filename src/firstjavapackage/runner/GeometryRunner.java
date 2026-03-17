package firstjavapackage.runner;

import firstjavapackage.Geometry;
import firstjavapackage.Point;
import firstjavapackage.Square;
import firstjavapackage.TriangleValidator;

public class GeometryRunner {

    public static void main (String[] args) {

        //Dimensions
        Geometry g1 = new Geometry(25);
        Geometry g2 = new Geometry(12);
        Geometry g3 = new Geometry(0);
        Geometry g4 = new Geometry(-5);

        //Point
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(-1, -1);

        //Square
        Square s1 = new Square(5);
        Square s2 = new Square(0);
        Square s3 = new Square(-3);

        //Triangle Validator
        boolean isValidTriangleFlag = new firstjavapackage.TriangleValidator().isValidTriangle(60, 60, 60);
        if (isValidTriangleFlag) {
            System.out.println("This is a valid triangle.");
        }
        else {
            System.out.println("Not a valid triangle");
        }
    }

}
