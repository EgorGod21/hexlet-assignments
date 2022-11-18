package exercise;

import java.util.*;
import  java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class Example {
    public static void main(String[] args) {
        Set<User> users=new HashSet<>();
        users.add(new User("nrjnr",3));
        users.add(new User("bmtobm",2));
        users.add(new User("btttr",1));
        users.add(new User("tijbit",4));

        System.out.println(users);
        users.add(new User("tijbit",5));
        System.out.println(users);
    }
}
class User{
    String name;
    int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
