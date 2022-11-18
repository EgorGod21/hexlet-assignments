package exercise;

import java.util.*;

public class App {
    public static Map <String,String> genDiff(Map<String,Object>map1,Map<String,Object>map2){
        Map<String,String> treeMap=new HashMap<>();
        Set <String> keys=new TreeSet<>(map1.keySet());
        keys.addAll(map2.keySet());
        for (String key:keys){
          if (!map1.containsKey(key)){
              treeMap.put(key,"added");
          }
          else if (!map2.containsKey(key)){
              treeMap.put(key,"deleted");
          }
          else if (map1.get(key).equals(map2.get(key))){
              treeMap.put(key,"unchanged");
          }
          else {treeMap.put(key,"changed");}
        }
        return treeMap;
    }

    public static void main(String[] args) {
        Map<String, Object> data1 = new HashMap<>(
                Map.of("one", "eon", "two", "two", "four", true, "abs", 'h')
        );
        Map<String, Object> data2 = new HashMap<>(
                Map.of("two", "own", "zero", 4, "four", true)
        );
        System.out.println(genDiff(data1,data2));
    }
}
