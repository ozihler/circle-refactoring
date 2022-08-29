package refactoring;

import java.util.ArrayList;

public class Circle {

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int countContainingPoints(int[] xCords, int[] yCords) {
        var points = new ArrayList<Point>();
        for (int i = 0; i < xCords.length; ++i) {
            var point = new Point(xCords[i], yCords[i]);
            points.add(point);
        }

        int numberOfPointsContainedInCircle = 0;
        for (Point point : points) {
            if (contains(point)) {
                numberOfPointsContainedInCircle++;
            }
        }
        return numberOfPointsContainedInCircle;
    }

    private boolean contains(Point point) {
        var deltaX = point.x() - this.center.x();
        var deltaY = point.y() - this.center.y();
        return square(deltaX) + square(deltaY) <= square(radius);
    }

    private int square(int number) {
        return number * number;
    }


    public void moveTo(int x, int y) {
        this.center = new Point(x, y);
    }

    public void resize(int r) {
        this.radius = r;
    }

    public String format() {
        return center.format() + ", " + radius;
    }

}
