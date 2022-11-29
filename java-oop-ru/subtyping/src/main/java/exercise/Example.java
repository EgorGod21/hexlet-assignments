package exercise;

import java.util.Map;

public class Example {
    public static void main(String[] args) {
KeyValueStorage keyValueStorage=new InMemoryKV(Map.of("1","p","2","u"));
keyValueStorage.set("3","e");
keyValueStorage.unset("1");
        System.out.println(keyValueStorage.get("4","def"));
System.out.println(keyValueStorage.toMap());
App.swapKeyValue(keyValueStorage);
        System.out.println(keyValueStorage.toMap());
    }
}
