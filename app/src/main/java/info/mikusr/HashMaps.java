package info.mikusr;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class HashMaps {
    public static void main(String[] arg) {
        Map<String, String> map1 = Map.of("1", "one", "2", "two", "three", "3");
        Map<String, String> map2 = new HashMap<>(Map.of("1", "one", "2", "two", "three", "3"));
        Map<String, String> sMap2 = Collections.synchronizedMap(map2);
        map2.put("4", "four");
        sMap2.put("four", "4");
        System.out.println(map1);
        System.out.println(map1.get("2"));
        System.out.println(map2);
        System.out.println(sMap2);
        System.out.println(map2.getOrDefault("3", "default"));
    }
}
