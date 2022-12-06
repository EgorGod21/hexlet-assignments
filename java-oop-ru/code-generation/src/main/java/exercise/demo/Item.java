package exercise.demo;


import lombok.*;

@Builder
@ToString
public class Item {
    @NonNull
    private int id;
    private String name;
    private Double price;

}
