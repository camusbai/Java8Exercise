package optional;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise {
    public static void main(String[] args) {
        ThreadLocalRandom.current().doubles(10).boxed().map(MyMath::inv).forEach(System.out::println);

    }
}
