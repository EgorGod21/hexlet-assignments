package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static boolean scrabble(String s1, String s2){
        List<String> myList1 = new ArrayList<>(Arrays.asList(s1.toLowerCase().split("")));
        List<String> myList2 = new ArrayList<>(Arrays.asList(s2.toLowerCase().split("")));
        for (int i=0; i< myList1.size();i++) {
            for (int j=0; j< myList2.size();j++) {
                if (myList1.get(i).equals(myList2.get(j))){
                    myList2.remove(j);
                    break;
                }
            }

        }
        return myList2.isEmpty();


    }

}
