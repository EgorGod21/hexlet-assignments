package exercise;

public class App {
    public static void printSquare(Circle circle){
        double sq;
        try {
            sq= circle.getSquare();
            System.out.println((int) Math.ceil(sq) );

        }
        catch (NegativeRadiusException e){
            System.out.println("Не удалось посчитать площадь");
        }
        System.out.println("Вычисление окончено");
    }

    public static void main(String[] args) {
        Point point=new Point(1,2);
        Circle circle=new Circle(point,-2);
        App.printSquare(circle);
    }
}
