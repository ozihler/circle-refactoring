package refactoring;

public record Point(int x, int y) {
    String asString() {
        return "(" + x() + ", " + y() + ")";
    }
}