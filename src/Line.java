public class Line {
    Point p1, p2;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double calculateLength() {
        return (double) Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    @Override
    public String toString() {
        return "Line [p1=" + p1 + ", p2=" + p2 + "]";
    }

}
