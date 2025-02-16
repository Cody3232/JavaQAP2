
public class TestMyLine {
    public static void main(String[] args) {
// Creating two MyPoint objects to use in line creation
        MyPoint p1 = new MyPoint(3, 4);  
        MyPoint p2 = new MyPoint(6, 8);  

// Creating MyLine objects using different constructors, the default constructor creates a line from (0,0) to (1,1)
        MyLine line1 = new MyLine();
        
// Constructor using two MyPoint objects
        MyLine line2 = new MyLine(p1, p2);
        
// Constructor using x and y coordinates directly
        MyLine line3 = new MyLine(1, 2, 5, 6);

// Printing the details of each line
        System.out.println("Default Line: " + line1);
        System.out.println("Line with two MyPoint objects: " + line2);
        System.out.println("Line with coordinates: " + line3);

// Testing set methods to modify an existin line
        line1.setStart(new MyPoint(2, 2));  
        line1.setEnd(new MyPoint(4, 6));    

// Printing updated lien details
        System.out.println("Updated Default Line: " + line1);
    }
}