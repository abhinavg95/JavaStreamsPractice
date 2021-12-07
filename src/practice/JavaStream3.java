package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream3 {
    public static void main(String[] args) {

        // 1.filter. The filter method takes input a predicate. A predicate is a boolean valued function.
        // Based on the predicate stream filters out the elements.
        List<String> names = List.of("Aman", "Ankit", "Abhinav", "Durgesh");
        List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        names.forEach(e -> System.out.print(e + " "));
        System.out.println();
        newNames.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // 2.map. On each element we can perform an operation.
        List<Integer> numbers = List.of(23, 4, 2, 5, 7, 4);
        List<Integer> newNumbers = numbers.stream().map(e -> e * e).collect(Collectors.toList());
        numbers.forEach(e -> System.out.print(e + " "));
        System.out.println();
        newNumbers.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // 3. sorted
        List<Integer> unsorted = List.of(23, 4, 2, 5, 7, 4);
        List<Integer> sorted = unsorted.stream().sorted().collect(Collectors.toList());
        unsorted.stream().forEach(e -> System.out.print(e + " "));
        System.out.println();
        sorted.stream().forEach(e -> System.out.print(e + " "));
        System.out.println();

        // 4. min
        List<Integer> numeric = List.of(23, 4, 2, 5, 7, 4);
        Integer minInteger = numeric.stream().min(Integer::compare).get();
        System.out.println("Minimum from the list "+minInteger);

        // 5. max
        Integer maxInteger = numeric.stream().max(Integer::compare).get();
        System.out.println("Maximum from the list "+maxInteger);
    }
}
