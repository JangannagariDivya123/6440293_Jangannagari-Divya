import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Requires Java 16 or later
public record Person(String name, int age) {}

public class RecordEx {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Divya", 20));
        people.add(new Person("Deepthi", 23));
        people.add(new Person("Yogitha", 20));

        System.out.println("All people:");
        people.forEach(System.out::println);

        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(Collectors.toList());

        System.out.println("Adults:");
        adults.forEach(System.out::println);
    }
}
