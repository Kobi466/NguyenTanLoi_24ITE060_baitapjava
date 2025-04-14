package bai7.bai7_2;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points;

    public PolyLine() {
        points = new ArrayList<>();
    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public void appendPoint(Point p) {
        points.add(p);
    }

    public void appendPoint(int x, int y) {
        points.add(new Point(x, y));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Point aPoint : points) {
            sb.append(aPoint.toString());
        }
        sb.append("}");
        return sb.toString();
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i <= points.size(); i++) {
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);
            length += Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        }
        return length;
    }
}
