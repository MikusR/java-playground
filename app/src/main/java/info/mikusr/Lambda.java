package info.mikusr;

import java.util.Scanner;
import java.util.function.Function;

public class Lambda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        scanner.close();

        Function<Integer, Boolean> function = x -> x % 15 == 0;
        System.out.println(function.apply(n));
    }
}
