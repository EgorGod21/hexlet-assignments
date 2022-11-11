package exercise;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example {
    static int x=5;
    public static void main(String[] args) {
//        List <Integer> list=List.of(1,2,3,4);
//        List<Integer> list1= list.stream().filter(x->x%2==0).collect(Collectors.toList());
//        System.out.println(list1);
//        int a= IntStream.iterate(1, x->x*2)
//                .filter(x->x>1000)
//                .findFirst().getAsInt();
//        List <Integer> list2=List.of(1,-1,-8,11,20,30,44);
//        list2.stream()
//                .filter(x->x>0)
//                .forEach(x-> System.out.println(x));
//        int n=list2.stream()
//                .filter(x->x>0)
//                .min(Integer::compareTo)
//                .orElse(0);
//        System.out.println(n);
//        int sum=list2.stream()
//                .reduce((x,y)->x+y)
//                .orElse(0);
//        System.out.println(sum);
//        int sum1=list2.stream().mapToInt(c->c)
//                .sum();
//        System.out.println(sum1);
//        double average=list2.stream().mapToInt(x->x)
//                .average()
//                .orElse(0);
//        System.out.println(average);
     List<String> names=List.of("Egor","","Max","Ivan","Petr","Patric","");
//     names= names.stream()
//             .filter(name-> StringUtils.isNotBlank(name))
//             .map(String::toUpperCase)
//             .collect(Collectors.toList());
//        System.out.println(names);
//        long amount=names.stream()
//                .filter(StringUtils::isNotBlank)
//                .filter(name->name.startsWith("P"))
//                .collect(Collectors.counting());
//        System.out.println(names);
//        System.out.println(amount);
        List <User> users=getUsersList();
//        Map<Boolean,List<User>> isOnlineMap=users.stream()
//                .filter(Objects::nonNull)
//                .collect(Collectors.groupingBy(User::isOnline,Collectors.toList()));
        if (users!=null){
           Map <Integer,List<String>> isdgt=users.stream()
                   .collect(Collectors.groupingBy(User::getAge,Collectors.mapping(User::getName, Collectors.toList())));
            System.out.println(isdgt);
        }
else {
            System.out.println("List is null");
        }

    }
    private static List<User> getUsersList(){
        List<User>users=new ArrayList<>();
        User user1=new User(1,"Egor",true,21);
        User user2=new User(2,"Oleg",false,18);
        User user3=new User(3,"Max",true,34);
        User user4=new User(4,"Lena",false,17);
        User user5=new User(5,"Piter",true,13);
        User user6=new User(6,"Scott",true,46);
        Collections.addAll(users,user1,user2,user3,user4,user5,user6);
        return users;
    }

}
class User{
    private Integer id;
    private String name;
    private boolean isOnline;
    private int age;

    public User(Integer id, String name, boolean isOnline, int age) {
        this.id = id;
        this.name = name;
        this.isOnline = isOnline;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isOnline=" + isOnline +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public int getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
