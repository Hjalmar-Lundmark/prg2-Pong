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
        x = -x;
    }

    public void bounce2(Paddle b) {
        if (b.getY() == y) {
            y = -y;
        }
    }

    //???
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
