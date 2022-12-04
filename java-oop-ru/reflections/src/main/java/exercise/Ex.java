package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ex {
    private static List<String> list=new ArrayList();
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Address address=new Address(null, "Texas", null, "7", "2");
        Map <String, List<String>> map=Validator.advancedValidate(address);
        System.out.println(map);
    }
}
