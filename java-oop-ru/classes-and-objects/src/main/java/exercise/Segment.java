package exercise;

public class Segment {
  private Point point1;
  private Point point2;

    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public Point getBeginPoint(){
       return point1;
    }
    public Point getEndPoint(){
        return point2;
    }
    public Point getMidPoint(){
        return new Point((point2.getX()+ point1.getX())/2,(point2.getY()+ point1.getY())/2);
    }

}