package refactoring;

public class Circle {

    private int centerX;
    private int centerY;
    private int radius;

    public Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public int countContainingPoints(int[] xCords, int[] yCords) {
        int numberOfPointsContainedInCircle = 0;
        for (int i = 0; i < xCords.length; ++i) {
            var deltaX = xCords[i] - this.centerX;
            var deltaY = yCords[i] - this.centerY;
            if (square(deltaX) + square(deltaY) <= square(radius)) {
                numberOfPointsContainedInCircle++;
            }
        }
        return numberOfPointsContainedInCircle;
    }

    private int square(int number) {
        return number * number;
    }


    public void moveTo(int x, int y) {
        this.centerX = x;
        this.centerY = y;
    }

    public void resize(int r) {
        this.radius = r;
    }

    public String format() {
        return "(" + centerX + ", " + centerY + "), " + radius;
    }

}
