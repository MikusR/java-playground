package info.mikusr;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {
    public static void main(String[] a) {
        Collection<String> langs = new ArrayList<>();
        langs.add("Korean");
        langs.add("Japanese");
        langs.add("Latvian");
        System.out.println(langs.size());
    }
}
