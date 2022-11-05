package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

public class App{
    public static List<Map<String, String>> findWhere (List<Map<String, String>> list, Map<String,String> map){
      List <Map<String, String>> books=new ArrayList<>();
      for (Map str:list){
          if (str.size()==map.size()){
              if (str.equals(map))
              books.add(str);

          }
          else {for (Map.Entry <String,String>t:map.entrySet()){

              if (str.containsKey(t.getKey())&&str.containsValue(t.getValue())){
              books.add(str);
              break;
              }
          }}

        }
      return books;
    }

    public static void main(String[] args) {
        List<Map<String, String>> BOOKS = List.of(
                Map.of("title", "Cymbeline", "author", "Shakespeare", "year", "1611"),
                Map.of("title", "Book of Fooos", "author", "FooBar", "year", "1111"),
                Map.of("title", "The Tempest", "author", "Shakespeare", "year", "1611"),
                Map.of("title", "Book of Foos Barrrs", "author", "FooBar", "year", "2222"),
                Map.of("title", "Still foooing", "author", "FooBar", "year", "3333"),
                Map.of("title", "Happy Foo", "author", "FooBar", "year", "4444")
        );
//        Map<String, String> where = Map.of("author", "Shakespeare", "year", "1611");
//        List<Map<String, String>> actual = App.findWhere(BOOKS, where);
//        System.out.println(actual);
        List<Map<String, String>> expected = List.of(
                Map.of("title", "Still foooing",
                        "author", "FooBar",
                        "year", "3333"
                )
        );
        Map<String, String> where1 = Map.of("title", "Still foooing",
                "author", "FooBar",
                "year", "3333"
        );
        List<Map<String, String>> actual1 = App.findWhere(BOOKS, where1);

        System.out.println(actual1);


    }
}
