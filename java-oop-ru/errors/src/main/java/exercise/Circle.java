package exercise;

public class Circle {
    private Point point;
    private int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public double getSquare() throws NegativeRadiusException {
        double square=Math.PI*radius*radius;
        if (radius<0){throw new NegativeRadiusException("");}
        return square;
    }

}
