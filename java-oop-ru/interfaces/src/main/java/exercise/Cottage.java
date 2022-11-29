package exercise;
public class Cottage implements Home{
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }


    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public int compareTo(Home another) {
        if (another.getArea()< this.getArea()){return 1;}
        else if (another.getArea()==this.getArea()){return 0;}
        else {return -1;}
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.floorCount).append(" этажный коттедж площадью ").append(this.getArea());
        sb.append(" метров");
        return sb.toString();
    }
}
