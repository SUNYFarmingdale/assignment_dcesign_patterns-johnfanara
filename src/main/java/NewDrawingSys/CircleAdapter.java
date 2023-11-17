package NewDrawingSys;



public class CircleAdapter implements Shape {
    private Circle circle;

    public CircleAdapter(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int r = (int) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2));
        circle.draw(x1, y1, r);
    }
}
