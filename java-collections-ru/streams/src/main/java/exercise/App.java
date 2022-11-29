package exercise;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Arrays;

public class App {
     static int i;
    public static int getCountOfFreeEmails(List<String> emails) {
        int result= (int)emails.stream()
                .filter(x->StringUtils.endsWithAny(x,"gmail.com","yandex.ru","hotmail.com"))
                .count();
        return result;
    }

    public static void main(String[] args) {

    }

}
