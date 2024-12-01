public class Rectangle {
    int length;
    int width;

    private Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public static Rectangle createSquare(int length) {
        return new Rectangle(length, length);
    }
}
