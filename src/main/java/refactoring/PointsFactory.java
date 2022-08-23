package refactoring;

import java.util.ArrayList;
import java.util.List;

public class PointsFactory {
    public static List<Point> createPoints(int[] xCords, int[] yCords) {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < xCords.length; ++i) {
            int xCord = xCords[i];
            int yCord = yCords[i];
            points.add(new Point(xCord, yCord));
        }
        return points;
    }
}
