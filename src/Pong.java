public class Pong {
    Boll boll;
    Paddle p1;
    Paddle p2;
    private int w;
    private int h;

    public Pong(int w, int h) {
        this.w = w;
        this.h = h;

        boll = new Boll(10, 10);
        p1 = new Paddle((w/2), 2);
        p2 = new Paddle((w/2), (h-2));
    }

    public void update() {



        boll.move();
        checkCollision();


    }

    private void checkCollision() {
        if (boll.getX() == w || boll.getY() == 0) {
            boll.bounce();
        }
    }
}
