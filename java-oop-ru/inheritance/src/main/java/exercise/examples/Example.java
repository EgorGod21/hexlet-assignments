package exercise.examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example{
    public static void main(String[] args) {
        Map <String,String> map=Map.of("class", "v-10", "id", "wop");
        String m=map.entrySet().stream()
                .map(i->String.format(" %s=\"%s\"",i.getKey(),i.getValue()))
                .collect(Collectors.joining());
        System.out.println(m);
    }

}
