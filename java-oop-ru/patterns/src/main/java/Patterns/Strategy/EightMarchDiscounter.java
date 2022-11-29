package Patterns.Strategy;

import java.time.LocalDate;
import java.util.Calendar;

public class EightMarchDiscounter implements Discounter{
    @Override
    public double applyDiscount(double price) {
        System.out.println("EightMarchDiscounter has been applied");
        return price * 0.75;
    }

    @Override
    public boolean checkCondition() {
        LocalDate currentDate=LocalDate.now();
        LocalDate startEightMarcDiscountDay=LocalDate.of(currentDate.getYear(), 3, 1);
        LocalDate eightMarchDay=LocalDate.of(currentDate.getYear(), 3, 8);


        return currentDate.isAfter(startEightMarcDiscountDay) && currentDate.isBefore(eightMarchDay);
    }
}
