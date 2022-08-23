package refactoring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    public static final int[] X_COORDINATES = new int[]{2, 3, 4, -12, -20};
    public static final int[] Y_COORDINATES = new int[]{8, 20, 15, -4, -20};
    private List<Point> points;

    @BeforeEach
    void setUp() {
        points = PointsFactory.createPoints(X_COORDINATES, Y_COORDINATES);
    }

    @Test
    void should_count_containing_points() {
        Circle circle = new Circle(new Point(0, 0), 20);
        assertEquals(3, circle.countContainingPoints(points));
    }

    @Test
    void should_move() {
        Circle Circle = new Circle(new Point(0, 0), 20);

        assertEquals(3, Circle.countContainingPoints(points));

        Circle.move(-30, -30);

        assertEquals(1, Circle.countContainingPoints(points));
    }

    @Test
    void should_resize() {
        Circle Circle = new Circle(new Point(0, 0), 20);
        assertEquals(3, Circle.countContainingPoints(points));

        Circle.resize(40);
        assertEquals(5, Circle.countContainingPoints(points));

        Circle.resize(1);
        assertEquals(0, Circle.countContainingPoints(points));
    }

    @Test
    void should_format() {
        Circle circle = new Circle(new Point(1, 4), 7);
        assertEquals("(1, 4), 7", circle.format());
    }
}