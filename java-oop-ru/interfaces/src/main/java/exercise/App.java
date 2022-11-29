package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static List<String> buildAppartmentsList(List<Home> homes, int size){
        return homes.stream()
                .sorted(Comparator.comparingDouble(Home::getArea))
                .limit(size)
                .map(Home::toString)
                .collect(Collectors.toList());
    }
}
