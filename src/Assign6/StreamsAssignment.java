package Assign6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAssignment {
    public static void main(String[] args) {

       List<String> stringList = Arrays.asList("apple","gap","add","And");
       //define filter criteria
       Predicate<String> st= a-> a.startsWith("a") && a.length()==3;

       stringList.stream()
               .filter(st)
               .collect(Collectors.toList())
               .forEach(a->System.out.println(a));
    }
}
