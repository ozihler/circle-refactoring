package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundShapeTest {
    @Test
    void should_count_containing_points() {
        RoundShape roundShape = new RoundShape(0, 0, 20);
        int[] xCoordinates = new int[]{2, 3, 4, -12, -20};
        int[] yCoordinates = new int[]{8, 20, 15, -4, -20};
        assertEquals(3, roundShape.cntPts(xCoordinates, yCoordinates));
    }

    @Test
    void should_move() {
        RoundShape RoundShape = new RoundShape(0, 0, 20);
        int[] xCoordinates = new int[]{2, 3, 4, -12, -20};
        int[] yCoordinates = new int[]{8, 20, 15, -4, -20};
        assertEquals(3, RoundShape.cntPts(xCoordinates, yCoordinates));

        RoundShape.mv(-30, -30);

        assertEquals(1, RoundShape.cntPts(xCoordinates, yCoordinates));
    }

    @Test
    void should_resize() {
        RoundShape RoundShape = new RoundShape(0, 0, 20);
        int[] xCoordinates = new int[]{2, 3, 4, -12, -20};
        int[] yCoordinates = new int[]{8, 20, 15, -4, -20};
        assertEquals(3, RoundShape.cntPts(xCoordinates, yCoordinates));

        RoundShape.rs(40);
        assertEquals(5, RoundShape.cntPts(xCoordinates, yCoordinates));

        RoundShape.rs(1);
        assertEquals(0, RoundShape.cntPts(xCoordinates, yCoordinates));
    }

    @Test
    void should_format() {
        RoundShape roundShape = new RoundShape(1, 4, 7);
        assertEquals("(1, 4), 7", roundShape.ft());
    }
}