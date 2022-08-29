package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void should_count_containing_points() {
        Circle circle = new Circle(new Point(0, 0), 20);
        int[] xCoordinates = new int[]{2, 3, 4, -12, -20};
        int[] yCoordinates = new int[]{8, 20, 15, -4, -20};
        assertEquals(3, circle.countContainingPoints(xCoordinates, yCoordinates));
    }

    @Test
    void should_move() {
        Circle Circle = new Circle(new Point(0, 0), 20);
        int[] xCoordinates = new int[]{2, 3, 4, -12, -20};
        int[] yCoordinates = new int[]{8, 20, 15, -4, -20};
        assertEquals(3, Circle.countContainingPoints(xCoordinates, yCoordinates));

        Circle.moveTo(-30, -30);

        assertEquals(1, Circle.countContainingPoints(xCoordinates, yCoordinates));
    }

    @Test
    void should_resize() {
        Circle Circle = new Circle(new Point(0, 0), 20);
        int[] xCoordinates = new int[]{2, 3, 4, -12, -20};
        int[] yCoordinates = new int[]{8, 20, 15, -4, -20};
        assertEquals(3, Circle.countContainingPoints(xCoordinates, yCoordinates));

        Circle.resize(40);
        assertEquals(5, Circle.countContainingPoints(xCoordinates, yCoordinates));

        Circle.resize(1);
        assertEquals(0, Circle.countContainingPoints(xCoordinates, yCoordinates));
    }

    @Test
    void should_format() {
        Circle circle = new Circle(new Point(1, 4), 7);
        assertEquals("(1, 4), 7", circle.format());
    }
}
