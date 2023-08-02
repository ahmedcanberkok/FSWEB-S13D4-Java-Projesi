public class Point {


    private int x;
    private int y;


    // Overloading
    public Point() {

    }

    public Point(int x) {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));


    }

    public double distance(Point p) {
        if (p != null) {
            return Math.sqrt(
                    (this.x - p.getX()) * (this.x - p.getX())
                            + (this.y - p.getY()) * (this.y - p.getY())
            );
        }
        return distance();
    }

    public double distance(int a, int b) {
        return Math.sqrt((x - a) * (x - a) + (y - b) * (y - b));
    }
}



