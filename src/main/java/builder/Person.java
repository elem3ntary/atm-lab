package builder;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Builder @ToString
public class Person {
    private String name;
    private int age;
    private double height;
    @Singular private List<String> friends;
}
