package refactoring;

import java.util.ArrayList;

public class PointsFactory {
	static ArrayList<Point> createPointsFrom(int[] xCords, int[] yCords) {
		var points = new ArrayList<Point>();
		for (int i = 0; i < xCords.length; ++i) {
			var point = new Point(xCords[i], yCords[i]);
			points.add(point);
		}
		return points;
	}
}
