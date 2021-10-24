package streamapi;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PokazColletorsToMap {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski", 3.0, 123456l);
        Student student2 = new Student("Asia", "Czernomsjk", 4.0, 456789l);
        Student student3 = new Student("Jan", "Kowalski", 5.0, 246890l);

        Map<Long, Student> longStudentMap = Arrays.asList(student1, student2, student3).stream()
                .collect(Collectors.toMap(Student::getIndex, Function.identity()));
        System.out.println(longStudentMap);

        System.out.println("____________________________________");
        longStudentMap.entrySet().stream()
                .collect(
                        Collectors.toMap(Map.Entry::getValue,
                                Map.Entry::getKey,
                                (oldValue, newValue) -> newValue,
                                () -> new TreeMap<>(Comparator.comparingDouble(Student::getGpa))))
                .forEach((k, v) -> System.out.println("klucz: " + k + "a value: " + v));

        /* Function.identity() dziala tak samo jak:
            (student) -> student
         */


    }
}

@Data
@AllArgsConstructor
class Student {
    private String name;
    private String surname;
    private Double gpa;
    private Long index;
}
