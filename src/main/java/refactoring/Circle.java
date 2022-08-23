package refactoring;

import java.util.List;

public class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int countContainingPoints(List<Point> points) {
        return (int) points.stream().filter(this::contains).count();
    }

    private boolean contains(Point point) {
        int deltaX = point.x() - center.x();
        int deltaY = point.y() - center.y();
        return square(deltaX) + square(deltaY) <= square(radius);
    }

    private int square(int number) {
        return number * number;
    }


    public void move(int x, int y) {
        this.center = new Point(x, y);
    }

    public void resize(int radius) {
        this.radius = radius;
    }

    public String format() {
        return center.format() + ", " + radius;
    }

}