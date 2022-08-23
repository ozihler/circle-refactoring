package refactoring;

public record Point(int x, int y) {
    String format() {
        return "(" + x() + ", " + y() + ")";
    }
}