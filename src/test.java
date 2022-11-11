public class test {
    public static void main(String[] args) {
        Pong p = new Pong(20, 20);
        for (int i = 0; i < 2147483646; i++) {
            p.update();
        }
    }
}
