package firstjavapackage;

public class Point {
    // x-coordinate of the point
    private int x;

    // y-coordinate of the point
    private int y;

    // Constructor for the Point class
    public Point(int x, int y) {
        this.x = x;  // Assigning x-coordinate of the point
        this.y = y;  // Assigning y-coordinate of the point
    }

    // Method to get the x-coordinate of the point
    public int getX() {
        return x;
    }

    // Method to get the y-coordinate of the point
    public int getY() {
        return y;
    }

    // TODO: Implement the method to move the point by dx and dy in x and y direction respectively
    public void move(int dx, int dy) {
        // Your code here
        x = x + dx;
        y = y + dy;
    }

    // TODO: Implement the method to calculateWithIf the distance from this point to another point
    public double distanceTo(Point other) {

        // Your code here
        int dx = other.x - this.x;
        int dy = other.y - this.y;
        return Math.sqrt( (dx * dx) + (dy * dy) );
    }
}
