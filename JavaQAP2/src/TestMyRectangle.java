public class TestMyRectangle {
    public static void main(String[] args) {
// Creating two MyPoint objects
        MyPoint p1 = new MyPoint(2, 5);  
        MyPoint p2 = new MyPoint(6, 2);  

// Creating MyRectangle objects using different constructors
// the first (rect1) is the initial rectangle 
        MyRectangle rect1 = new MyRectangle(); 
        MyRectangle rect2 = new MyRectangle(p1, p2);
        MyRectangle rect3 = new MyRectangle(1, 4, 5, 1);

// Prints details of each rectangle
        System.out.println("Default Rectangle: " + rect1);
        System.out.println("Rectangle with two MyPoint objects: " + rect2);
        System.out.println("Rectangle with coordinates: " + rect3);

// Testing setters to modify an existing rectangle
        rect1.setTopLeft(new MyPoint(1, 5));
        rect1.setBottomRight(new MyPoint(4, 2));

// Printsupdated rectangle details
        System.out.println("Updated Default Rectangle: " + rect1);
    }
}
