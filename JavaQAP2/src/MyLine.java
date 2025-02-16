public class MyLine {
// Make two points for the beginning and ending points
    private MyPoint start;
    private MyPoint end;    

// Make the default constructor, and have the line use default points
    public MyLine () {
        this.start = new MyPoint (0, 0); 
        this.end = new MyPoint (1, 1);
    }

// This constructor will initialize the line by using objects
    public MyLine (MyPoint start, MyPoint end) {
        this.start = start;
        this.end = end;
    }

// Constructor to manipulate the line using objects
    public MyLine (int x1, int y1, int x2, int y2) {
        this.start = new MyPoint (x1, y1);
        this.end = new MyPoint (x2, y2);
    }

// Get method for the starting point
    public MyPoint getStart () {
        return start;
    }

// Get methord for the ending point
    public MyPoint getEnd () {
        return end;
    }

// Set method that will alow a change in the start point of the line
    public void setStart (MyPoint start) {
        this.start = start;
    }

// Set method thst will allow a change in the end point of the line
    public void setEnd (MyPoint end) {
        this.end = end;
    }

// Calculate the length of the line
    public double getLength () {
        return start.distance (end);
    }

// Display the string length as a string.
public String toString() {
    return "Line from " + start + " to " + end + " with length: " + getLength();
}
}

