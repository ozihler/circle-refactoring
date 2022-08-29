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
        Circle circle = new Circle(new Point(0, 0), 20);
        int[] xCoordinates = new int[]{2, 3, 4, -12, -20};
        int[] yCoordinates = new int[]{8, 20, 15, -4, -20};
        assertEquals(3, circle.countContainingPoints(xCoordinates, yCoordinates));

        circle.moveTo(-30, -30);

        assertEquals(1, circle.countContainingPoints(xCoordinates, yCoordinates));
    }

    @Test
    void should_resize() {
        Circle circle = new Circle(new Point(0, 0), 20);
        int[] xCoordinates = new int[]{2, 3, 4, -12, -20};
        int[] yCoordinates = new int[]{8, 20, 15, -4, -20};
        assertEquals(3, circle.countContainingPoints(xCoordinates, yCoordinates));

        circle.resize(40);
        assertEquals(5, circle.countContainingPoints(xCoordinates, yCoordinates));

        circle.resize(1);
        assertEquals(0, circle.countContainingPoints(xCoordinates, yCoordinates));
    }

    @Test
    void should_format() {
        Circle circle = new Circle(new Point(1, 4), 7);
        assertEquals("(1, 4), 7", circle.format());
    }
}
