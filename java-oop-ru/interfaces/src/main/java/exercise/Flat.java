package exercise;

public class Flat implements Home{
    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return this.area+this.balconyArea;
    }

    @Override
    public int compareTo(Home another) {
        if (another.getArea()< this.getArea()){return 1;}
        else if (another.getArea()==this.getArea()){return 0;}
        else {return -1;}
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Квартира площадью ").append(this.getArea());
        sb.append(" метров на ").append(floor);
        sb.append(" этаже");
        return sb.toString();
    }
}
