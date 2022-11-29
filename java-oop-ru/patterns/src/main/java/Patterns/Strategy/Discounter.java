package Patterns.Strategy;

public interface Discounter {
    double applyDiscount(double price);
    boolean checkCondition();
}
