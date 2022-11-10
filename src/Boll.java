public class Boll {
    private int x;
    private int y;
    private int vx;
    private int vy;

    public Boll(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        x += vx;
        y += vy;
    }

    public void bounce() {
        y = -y;
    }

    public void bounce(Paddle b) {
        x = -x;
    }
}
