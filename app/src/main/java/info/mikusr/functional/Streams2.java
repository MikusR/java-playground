package info.mikusr.functional;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams2 {
    public static void main(String[] args) {
        List<String> vegs = List.of(
                "spinach",
                "cabbage",
                "peas",
                "green beans",
                "brussel sprouts",
                "carrots");

        vegs.stream().anyMatch(v -> v.contains(" "));

        vegs.stream()
                .filter(v -> v.contains(" "))
                .forEach(System.out::println);
        System.out.println(vegs);
        vegs.stream()
                .filter(v -> v.contains(" "))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println(vegs);
        System.out.println(vegs.stream()
                .sorted()
                .reduce("", (a, b) -> a + "||" + b));
        List sss = vegs.stream()
                .filter(v -> v.endsWith("s"))
                .collect(Collectors.toList());
        System.out.println(sss);

        List<Integer> numbers = List.of(2, 4, 6, 8, 10);
        Integer reduced = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduced);
    }
}
