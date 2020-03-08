public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return this.distance(0, 0);
    }

    public double distance(Point point) {
        return this.distance(point.x, point.y);
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(y - this.y, 2) + Math.pow(x - this.x, 2));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}