package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream1 {
    public static void main(String args[]) {

        // Question 1 -> Filter out the even elements from the list
        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67);

        // Without using Java Streams
        List<Integer> evenList1 = new ArrayList<>();
        for (Integer integer : list1) {
            if (integer % 2 == 0) {
                evenList1.add(integer);
            }
        }

        //Using JAVA Streams
        Stream<Integer> stream = list1.stream();
        List<Integer> evenList2 = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());

        // Using JAVA Streams (Shorter Version)
        List<Integer> evenList3 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        // Printing outputs from the original, and newly created lists.
        System.out.println(list1);
        System.out.println(evenList1);
        System.out.println(evenList2);
        System.out.println(evenList3);
    }
}