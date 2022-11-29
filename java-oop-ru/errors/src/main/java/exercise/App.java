package exercise;

public class App {
    public static void printSquare(Circle circle){

        try {
            double square = circle.getSquare();
            System.out.println(Math.round(square));

        }
        catch (NegativeRadiusException e){
            System.out.println("Не удалось посчитать площадь");
        }
        finally {
            System.out.println("Вычисление окончено");
        }

    }

    public static void main(String[] args) {
        Point point=new Point(1,2);
        Circle circle=new Circle(point,-2);
        App.printSquare(circle);
    }
}
