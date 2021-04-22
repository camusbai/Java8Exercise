package spliterator;

import java.util.Spliterator;
import java.util.function.Consumer;

public class PersonSpliterator implements Spliterator<Person> {
    Spliterator<String> lineSpliterator;
    private String name;
    private String age;
    private String gender;

    public PersonSpliterator(Spliterator<String> lineSpliterator) {
        this.lineSpliterator = lineSpliterator;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Person> action) {
        if (lineSpliterator.tryAdvance(line -> this.name = line) &&
                lineSpliterator.tryAdvance(line -> this.age = line) &&
                lineSpliterator.tryAdvance(line -> this.gender = line)) {
            Person person = new Person(name, Integer.parseInt(age), gender);
            action.accept(person);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Spliterator<Person> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return lineSpliterator.estimateSize() / 3;
    }

    @Override
    public int characteristics() {
        return lineSpliterator.characteristics();
    }
}
