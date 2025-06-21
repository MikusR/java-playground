package info.mikusr;

import java.util.ArrayList;

public class Arrays2 {
    public static void main(String[] need) {
        ArrayList<String> alistOne = new ArrayList<>();
        alistOne.add("ev1");
        alistOne.add("ev2");
        alistOne.add("ev3");
        System.out.println(alistOne);
        System.out.println(alistOne.get(alistOne.size() - 1));// getlast was added in java 21
        alistOne.remove("ev2");
        System.out.println(alistOne);
    }
}
