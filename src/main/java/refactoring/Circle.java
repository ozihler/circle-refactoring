package refactoring;

public class Circle {

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int countContainingPoints(int[] xCords, int[] yCords) {
        int numberOfPointsContainedInCircle = 0;
        for (int i = 0; i < xCords.length; ++i) {
            var xCord = xCords[i];
            var yCord = yCords[i];
            if (contains(xCord, yCord)) {
                numberOfPointsContainedInCircle++;
            }
        }
        return numberOfPointsContainedInCircle;
    }

    private boolean contains(int xCord, int yCord) {
        var deltaX = xCord - this.center.x();
        var deltaY = yCord - this.center.y();
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
