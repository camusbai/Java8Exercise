package spliterator;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class TestRun {
    public static void main(String[] args) throws URISyntaxException {
        Path path = Paths.get(ClassLoader.getSystemResource("People.txt").toURI());
        try (Stream<String> lines = Files.lines(path)) {
            Spliterator<String> lineSpliterator = lines.spliterator();
            PersonSpliterator personSpliterator = new PersonSpliterator(lineSpliterator);
            Stream<Person> personStream = StreamSupport.stream(personSpliterator, false);
            personStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
