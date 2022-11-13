package exercise;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
//        boolean str= StringUtils.contains("ttby","t");
//        System.out.println(str);
//List<User> users=getUsersList();
//users.stream()
//        .filter(x->x.getAge()>=18)
//        .forEach(System.out::println);
//        Consumer<String> consumer=x-> System.out.println(x);
//        consumer.accept("Hello");
//
//        Supplier<LocalDateTime> localDateSupplier=LocalDateTime::now;
//        System.out.println(localDateSupplier.get());
//
//        Function<Integer,Integer> integerFunction=Math::abs;
//        System.out.println(integerFunction.apply(-3));
//
//        Predicate<User> predicate=x->x.getAge()>=18;
//        System.out.println(predicate.test(new User(1,"Egor",true,21)));
//
        User user=new User(4,"Lena",false,17);
        Consumer <User> consumer=u-> {
        if (u.getAge()<18){
            System.out.println("Privet");
        }
        else System.out.println("Zdrasty");
        };
        consumer.accept(user);
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

    private List<User> friends;

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public List<User> getFriends() {
        return friends;
    }

    public User(Integer id, String name, boolean isOnline, int age) {
        this.id = id;
        this.name = name;
        this.isOnline = isOnline;
        this.age = age;
    }
//    public String greetUsers(User user){
//return "Hello dear user "+user.getName();
//    }
public long getFriendsAmount(){
     return this.getFriends().stream()
             .filter(x->x.getAge()>=18)
             .count();
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

