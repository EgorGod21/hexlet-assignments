package exercise;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void swapKeyValue(KeyValueStorage map){
       Map <String,String> map1=new HashMap<>();
        for (Map.Entry<String, String> m: map.toMap().entrySet()){
            String key=m.getKey();
            String value=m.getValue();
            map1.put(value,key);
        }
        map.setMap(map1);

    }
}
