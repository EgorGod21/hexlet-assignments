package exercise;

import java.util.List;

public class Example {

    public static void main(String[] args) {
        System.out.println("Object type: "+Car.TYPE);
        Car kia=new Kia();
        Car bmw=new Bmw();

        List<Car> cars=List.of(kia,bmw);
        for (Car car:cars){
            car.go();
        }
    }
}
