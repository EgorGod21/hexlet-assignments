package exercise;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users){
        List<String> result= users.stream()
                .filter(x->x.get("gender").equals("male"))
                .sorted((o1, o2) -> {
                    String [] birthday1= o1.get("birthday").split("-");
                    String [] birthday2=o2.get("birthday").split("-");
                    LocalDate localDate1=LocalDate.of(Integer.parseInt(birthday1[0]),Integer.parseInt(birthday1[1]),Integer.parseInt(birthday1[2]));
                    LocalDate localDate2=LocalDate.of(Integer.parseInt(birthday2[0]),Integer.parseInt(birthday2[1]),Integer.parseInt(birthday2[2]));
                    if (localDate1.isBefore(localDate2))
                    return -1;
                    else if(localDate1.isAfter(localDate2))
                        return 1;
                    else
                        return 0;
                })
                .map(x->x.get("name"))
                .collect(Collectors.toList());
        return result;
    }

    }
