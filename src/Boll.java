public class Boll {
    private int x;
    private int y;
    private int vx = 1;
    private int vy = 1;

    public Boll(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        x += vx;
        y += vy;
    }

    public void bounce() {
        vx = -vx;
    }

    public void bounce2(Paddle b) {
        if (y == (b.getY()-1) && y == (b.getY()+1) && b.getX() <= x && x <= (b.getX()+b.getWidth())) {
                vy = -vy;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
