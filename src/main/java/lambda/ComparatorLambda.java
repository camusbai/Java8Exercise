package lambda;

import java.util.Comparator;

public class ComparatorLambda {
    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.comparingInt(String::length);
    }
}
