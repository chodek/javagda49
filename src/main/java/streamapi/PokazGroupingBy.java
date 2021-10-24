package streamapi;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PokazGroupingBy {
    public static void main(String[] args) {

        Stream.of("This", "is", "SDA", "the", "best", "academy", "in", "the", "universe", "academy", "in", "the", "universe")
                .collect(Collectors.groupingBy(Function.identity()))
                .forEach((key, value) -> System.out.println(key + " " + value));

        /* wynik programu to:
        2 [is, in]
        3 [SDA, the, the]
        4 [This, best]
        7 [academy]
        8 [universe]
        */
    }
}
