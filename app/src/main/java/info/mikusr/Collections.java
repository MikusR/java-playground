package info.mikusr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collections {
    public static void main(String[] a) {
        Collection<String> langs = new ArrayList<>();
        langs.add("Korean");
        langs.add("Japanese");
        langs.add("Latvian");

        ArrayList<String> lan = new ArrayList<>(langs);
        langs.addAll(lan);
        System.out.println(langs.size());
        for (String l : langs) {
            System.out.println(l);
        }
        langs.forEach(e -> System.out.println(e.length()));

        langs.removeIf(e -> e.startsWith("L"));
        langs.forEach(e -> System.out.println(e));
        lan.add("Last one");
        lan.add(0, "First one");
        lan.forEach(System.out::println);
        lan.set(0, "Why");

        lan.addAll(List.of("Test1", "Test2"));
        System.out.println("----------------------");
        lan.forEach(e -> System.out.println(lan.indexOf(e) + " " + e));
        List<Integer> testImmutable = List.of(1, 2, 4);
        // test.add(3); cant because immutable
        System.out.println("----------------------");
        System.out.println(testImmutable);
    }
}
