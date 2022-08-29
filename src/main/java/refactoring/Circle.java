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
            if ((xCords[i] - this.centerX) * (xCords[i] - this.centerX) + (yCords[i] - this.centerY) * (yCords[i] - this.centerY) <= radius * radius) {
                numberOfPointsContainedInCircle++;
            }
        }
        return numberOfPointsContainedInCircle;
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
