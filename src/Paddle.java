public class Paddle {
    private int x;
    private int y;
    private int width = 10;

    public Paddle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        y -= 1;
    }

    public void moveDown() {
        y += 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }
}
