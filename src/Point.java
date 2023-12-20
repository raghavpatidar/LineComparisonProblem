
public class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    public boolean equals(Point p) {
        if (this == p)
            return true;
        return (this.x == p.x && this.y == p.y);
    }

}
