package info.mikusr.functional;

import java.util.function.Consumer;

public class Interaces {
    public static void main(String[] args) {

        // lambda
        Consumer prl = c -> System.out.println(c);
        // method reference
        Consumer<String> prr = System.out::println;

        prl.accept("Boo");
        prr.accept("Boo, but method reference");
    }
}
