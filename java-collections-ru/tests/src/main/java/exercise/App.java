package exercise;

import java.util.List;

class App {
    public static List<Integer> take(List<Integer> elements, int i) {
        String implementation = System.getenv("IMPLEMENTATION") != null
            ? System.getenv("IMPLEMENTATION")
            : "right";

        switch (implementation) {
            case "wrong1":
                return Implementations.wrong1(elements, i);
            case "wrong2":
                return Implementations.wrong2(elements, i);
            case "wrong3":
                return Implementations.wrong3(elements, i);
            default:
                return Implementations.right(elements, i);
        }
    }
}
