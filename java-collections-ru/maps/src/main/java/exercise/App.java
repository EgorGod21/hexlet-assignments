package exercise;

import java.util.*;

public class App {
     public static Map<String,Integer> getWordCount(String sentence){
         List<String> list=new ArrayList<>(Arrays.asList(sentence.split(" ")));
         Map <String,Integer> map=new HashMap<>();
         for (String word : list)
         {
             if (!map.containsKey(word))
             {
                 map.put(word, 0);
             }
             map.put(word, map.get(word) + 1);
         }
         return map;

     }


    public static String toString(Map<String,Integer>wordsCount){
        if (wordsCount.isEmpty()) {
            return "{}";
        }

        StringBuilder result = new StringBuilder("{\n");

        for (Object key : wordsCount.keySet()) {
            result.append("  " + key + ": " + wordsCount.get(key) + "\n");
        }

        result.append("}");
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(App.toString(App.getWordCount("word text dog apple word apple word")));
    }
}

