package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Validator {
    public static final List<String> LIST1=List.of("length less than 4");
    public static final List<String> LIST2=List.of("can not be null");

    public static List<String> validate(Address address) throws IllegalAccessException {
        List<String> list=new ArrayList();
        for (Field field:address.getClass().getDeclaredFields()){
            NotNull notNull=field.getAnnotation(NotNull.class);
            field.setAccessible(true);
            if (notNull!=null && field.get(address)==null){
                list.add(field.getName());
            }


        }
        return list;
    }
    public static Map <String,List <String>> advancedValidate(Address address) throws IllegalAccessException {
       Map <String,List<String>> map=new HashMap<>();
        for (Field field:address.getClass().getDeclaredFields()){
            NotNull notNull=field.getAnnotation(NotNull.class);
            MinLength minLength=field.getAnnotation(MinLength.class);
            field.setAccessible(true);
            if (notNull!=null && field.get(address)==null){
                map.put(field.getName(),LIST2);
            }
            else if (minLength!=null && ((String) (field.get(address))).length()<4){
                    map.put(field.getName(), LIST1);
            }

        }

       return map;

    }
}
