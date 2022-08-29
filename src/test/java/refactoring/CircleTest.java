package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void should_count_containing_points() {
        Circle circle = new Circle(new Point(0, 0), 20);
        int[] xCoordinates = new int[]{2, 3, 4, -12, -20};
        int[] yCoordinates = new int[]{8, 20, 15, -4, -20};
        var points = PointsFactory.createPointsFrom(xCoordinates, yCoordinates);
        assertEquals(3, circle.countContainingPoints(points));
    }

    @Test
    void should_move() {
        Circle circle = new Circle(new Point(0, 0), 20);
        int[] xCoordinates = new int[]{2, 3, 4, -12, -20};
        int[] yCoordinates = new int[]{8, 20, 15, -4, -20};
        var points1 = PointsFactory.createPointsFrom(xCoordinates, yCoordinates);
        assertEquals(3, circle.countContainingPoints(points1));

        circle.moveTo(-30, -30);

        var points = PointsFactory.createPointsFrom(xCoordinates, yCoordinates);
        assertEquals(1, circle.countContainingPoints(points));
    }

    @Test
    void should_resize() {
        Circle circle = new Circle(new Point(0, 0), 20);
        int[] xCoordinates = new int[]{2, 3, 4, -12, -20};
        int[] yCoordinates = new int[]{8, 20, 15, -4, -20};
        var points2 = PointsFactory.createPointsFrom(xCoordinates, yCoordinates);
        assertEquals(3, circle.countContainingPoints(points2));

        circle.resize(40);
        var points1 = PointsFactory.createPointsFrom(xCoordinates, yCoordinates);
        assertEquals(5, circle.countContainingPoints(points1));

        circle.resize(1);
        var points = PointsFactory.createPointsFrom(xCoordinates, yCoordinates);
        assertEquals(0, circle.countContainingPoints(points));
    }

    @Test
    void should_format() {
        Circle circle = new Circle(new Point(1, 4), 7);
        assertEquals("(1, 4), 7", circle.format());
    }
}
