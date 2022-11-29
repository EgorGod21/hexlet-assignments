package Patterns.Strategy;

import java.time.LocalDate;
import java.util.Calendar;

public class ChristmasDiscounter implements Discounter{
    @Override
    public double applyDiscount(double price) {
        System.out.println("ChristmasDiscounter has been applied");
        return price * 0.5;
    }

    @Override
    public boolean checkCondition() {
        LocalDate currentDate=LocalDate.now();
        LocalDate startChristmasDiscountDay=LocalDate.of(currentDate.getYear(), 12, 1);
        LocalDate ChristmasDiscountDay=LocalDate.of(currentDate.getYear(), 12, 25);

        return currentDate.isAfter(startChristmasDiscountDay) && currentDate.isBefore(ChristmasDiscountDay);

    }
}
