package refactoring;

public class RoundShape {

    private int x;
    private int y;
    private int r;

    public RoundShape(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int cntPts(int[] xCords, int[] yCords) {
        int nrPts = 0;
        for (int i = 0; i < xCords.length; ++i) {
            if ((xCords[i] - this.x) * (xCords[i] - this.x) + (yCords[i] - this.y) * (yCords[i] - this.y) <= r * r) {
                nrPts++;
            }
        }
        return nrPts;
    }


    public void mv(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void rs(int r) {
        this.r = r;
    }

    public String ft() {
        return "(" + x + ", " + y + "), " + r;
    }

}