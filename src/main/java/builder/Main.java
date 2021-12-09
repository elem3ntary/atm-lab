package builder;

public class Main {
    public static void main(String[] args) {
        Person p = Person.builder().age(10).friend("Josh").friend("Petro").name("Ivan").build();
        System.out.println(p);
    }
}
