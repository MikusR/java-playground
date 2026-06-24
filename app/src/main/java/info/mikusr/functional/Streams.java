package info.mikusr.functional;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Streams {
    public static void main(String[] args) {

        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("\n===\n");
        Arrays.stream(numbers)
                .forEach(System.out::print);
        System.out.println("\n===\n");
        Arrays.stream(numbers)
                .forEach(n -> System.out.println(n + 1 + " "));
        System.out.println("\n===\n");
        Arrays.stream(numbers)
                .parallel()
                .forEach(n -> System.out.print(n + 1 + " "));

        System.out.println("\n===\n");
    }
}
