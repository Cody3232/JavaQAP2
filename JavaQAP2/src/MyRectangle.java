
public class MyRectangle {
// Instance variables: two MyPoint objects
    private MyPoint topLeft;
    private MyPoint bottomRight;

// Default constructor: initializes a small rectangle from (0,0) to (1,1).
    public MyRectangle() {
        this.topLeft = new MyPoint(0, 1);
        this.bottomRight = new MyPoint(1, 0);
    }

// Constructor using two MyPoint objects.
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

// Identifies various points
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

// Get methods
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

// Set methods
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

// Computes the width of the rectangle
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

// This determines the height of the rectangle
    public int getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }


// Computes the area of the rectangle.
    public int getArea() {
        return getWidth() * getHeight();
    }

// This determines  the perimeter of the rectangle.
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

// Provides a string representation of the rectangle.
    @Override
    public String toString() {
        return "Rectangle [Top Left: " + topLeft + ", Bottom Right: " + bottomRight +
                ", Width: " + getWidth() + ", Height: " + getHeight() +
                ", Area: " + getArea() + ", Perimeter: " + getPerimeter() + "]";
    }
}
