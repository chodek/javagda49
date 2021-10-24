package streamapi;

import java.util.stream.Stream;

public class PokazReduce {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("one", "two", "three");


        stream.reduce((one, two) -> one.toUpperCase() + " " + two.toLowerCase())
                .ifPresent(System.out::println);
    }
}
