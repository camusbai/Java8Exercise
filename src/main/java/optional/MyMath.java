package optional;

import java.util.Optional;

public class MyMath {
    public static Optional<Double> inv(Double input) {
        return input != 0 ? Optional.of(1 / input) : Optional.empty();
    }
}
