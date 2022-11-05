package exercise;

import java.util.*;

class App {
    public static Map getWordCount(String sentence) {

        String[] words = sentence.split(" ");
        Map <String,Integer> map = new HashMap();

        if (sentence.length() == 0) {
            return map;
        }

        for (String word : words) {
            if (!map.containsKey(word))
            map.put(word, 0);

            map.put(word, map.get(word)+1);
        }

        return map;
    }

    public static String toString(Map wordsCount) {

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
}