package info.mikusr;

import java.util.ArrayList;
import java.util.List;

public class Iterators {
    public static void main(String[] aargh) {
        List<String> fruuts = new ArrayList<String>();

        fruuts.add("aaple");
        fruuts.add("baanana");
        fruuts.add("ciitrus");
        fruuts.add("daaple");

        var i = fruuts.iterator();

        System.out.println(fruuts);

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        for (String fruut : fruuts) {
            System.out.println(fruut);
        }

        fruuts.forEach(f -> System.out.println(f));
        fruuts.forEach(System.out::println);

    }
}
