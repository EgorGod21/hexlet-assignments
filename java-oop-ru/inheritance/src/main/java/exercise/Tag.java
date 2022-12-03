package exercise;

import java.util.stream.Collectors;
import java.util.Map;

public class Tag {
     String name;
     Map<String,String> map;

    public Tag(String name, Map<String, String> map) {
        this.name = name;
        this.map = map;
    }
}
