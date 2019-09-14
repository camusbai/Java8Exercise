package stream;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExercise {
    public static void main(String[] args) {
        Stream<String> data = Stream.of("Josh", "Bush", "Dash", "Billy");

        Predicate<String> p1 = s -> s.length() < 5;
        Predicate<String> p2 = Predicate.isEqual("Bush");
        Predicate<String> p3 = Predicate.isEqual("Dash");
        data.filter(p1).filter(p2.or(p3))
                .peek(System.out::println);
    }
}
