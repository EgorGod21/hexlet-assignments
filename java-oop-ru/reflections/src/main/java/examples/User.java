package examples;

public class User {
    private Integer id;
    private String name;
    private int age;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
    private String getGreetingMsg(){
        return "Hello, "+name;
    }
}
