public class Pong {
    Boll boll;
    Paddle p1;
    Paddle p2;
    private int w;
    private int h;
    //Mitt Pong har paddlarna uppe och nere, inte vänster och höger

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
        if (boll.getX() == (w-1) || boll.getX() == 1) {
            boll.bounce();
        }
        boll.bounce2(p1);
        boll.bounce2(p2);
    }

    public void checkWin(boolean u, boolean n) {
        if (boll.getY() == 0) {
            System.out.println("Nedre spelaren vann");
            n = true;
        } else{
            if (boll.getY() == h) {
                System.out.println("Övre spelaren vann");
                u = true;
            }
        }
    }
}
