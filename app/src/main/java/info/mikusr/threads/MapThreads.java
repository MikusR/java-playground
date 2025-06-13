package info.mikusr.threads;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class MapThreads {
    public static void main(String[] arg) throws InterruptedException {
        Map<String, String> map = new HashMap<>(Map.of("1", "one", "2", "two", "three", "3"));
        Map<String, String> sMap = Collections.synchronizedMap(map);
        map.put("4", "four");
        sMap.put("four", "4");
        System.out.println(map);
        System.out.println(sMap);
        System.out.println(map.getOrDefault("3", "default"));
        Thread even = new Thread(() -> {
            try {
                System.out.println("Start even");
                addEven(sMap);
            } catch (InterruptedException e) {
                System.out.println("errrrr");
                e.printStackTrace();
            }
        });
        Thread odd = new Thread(() -> {
            try {
                System.out.println("Start odd");
                addOdd(sMap);
            } catch (InterruptedException e) {
                System.out.println("errrrr");
                e.printStackTrace();
            }
        });
        even.start();
        addOdd(sMap);
        even.join();
        System.out.println(sMap);// Only one thread at a time has access to the map, other threads are blocked.
        // even.join();
        System.out.println("Just printed smap");
        // even.join();
    }

    private static void addEven(Map<String, String> aMap) throws InterruptedException {
        System.out.println("Enter even");
        for (int i = 0; i < 100; i++) {
            String threadName = Thread.currentThread().getName();
            if (!"main".equals(threadName)) {
                // System.out.println(threadName);
                Thread.sleep(10);
            }

            if (i % 2 == 0) {
                aMap.put(Integer.toString(i), "Even number " + i);
            }
        }
        System.out.println("Exit Even");
    }

    private static void addOdd(Map<String, String> aMap) throws InterruptedException {
        System.out.println("Enter odd");
        for (int i = 0; i < 100; i++) {
            String threadName = Thread.currentThread().getName();
            if (!"main".equals(threadName)) {
                // System.out.println(threadName);
                Thread.sleep(10);
            }

            if (i % 2 != 0) {
                aMap.put(Integer.toString(i), "Odd number " + i);
            }
        }
        System.out.println("Exit Odd");
    }
}
