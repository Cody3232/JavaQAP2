public class MyPoint {
    private int x;
    private int y;

// This will be the default constructor
    public MyPoint () {
        this.x = 0;
        this.y = 0;
    }

// This will act as the parameters constructor 
    public MyPoint (int x, int y) {
        this.x = x;
        this.y = y;
    }

// This will be the gets and sets for x and y
    public int getX () {
        return x;
    } 

    public void setX(int x) {
        this.x = x;
    }

    public int getY () {
        return y;
    }

    public void setY (int y) {
        this.y = y;
    }

// Method used to calculate the distance //Found math.sqrt and math.pow on scaler.com
    public double distance(MyPoint other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
    }

// Convert to a string
    @Override
    public String toString () {
        return "(" + x + ", " + y + ")";
    }
}
