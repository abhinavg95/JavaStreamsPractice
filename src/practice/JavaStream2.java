package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStream2 {
    public static void main(String[] args) {

        // Creating a stream object. Stream is basically an interface.
        // Stream API is basically used to work on a collection but can be used with arrays also

        // 1-Blank
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> System.out.println(e)); // Nothing will get printed as stream is empty

        // 2- Using Array,Object,Collection
        String names[] = {"Durgesh", "Uttam", "Ankit", "Divya"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // 3- Using builder patterm
        Stream<Object> streamBuilder = Stream.builder().add("A").add("B").add("C").add("D").add("E").build();
        streamBuilder.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // 4 - Using Arrays.stream
        IntStream intStream = Arrays.stream(new int[]{2, 4, 65, 3, 564}); // IntStream is also a kind of stream
        intStream.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // 5- List,Set
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(23);
        list.add(78);

        Stream<Integer> listStream = list.stream();
        listStream.forEach(e -> System.out.print(e+" "));
        System.out.println();
    }
}
