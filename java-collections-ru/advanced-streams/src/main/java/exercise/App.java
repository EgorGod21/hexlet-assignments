package exercise;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Collectors;
import java.util.Arrays;

public class App {
public static String getForwardedVariables(String path){
    String[] lines = path.split("\n");
    return Arrays.stream(lines)
            .filter(x->x.startsWith("environment="))
            .map(x->x.replaceAll("environment=\"",""))
            .map(x->x.replaceAll("\"",""))
            .map(s->s.split(","))
            .flatMap(s->Arrays.stream(s))
            .filter(s->s.startsWith("X_FORWARDED_"))
            .map(s->s.replaceAll("X_FORWARDED_",""))
            .collect(Collectors.joining(","));



}
    public static void main(String[] args) {
        Person p1=new Person("Anna",20);
        Person p2=p1;
        p2.name="Inna";
        p2.age=25;
        p2=null;
        System.out.println(p1.name);
        System.out.println(p1.age);
    }

}
class Person{
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}