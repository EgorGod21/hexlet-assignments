package exercise;

public class Square {
    private double a;
    public Square(double a){
        this.a=a;
    }
    public double getSide(){
        return a;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("a=").append(a);
        sb.append('}');
        return sb.toString();
    }
}
