package info.mikusr.Objects.Peeple;

import static info.mikusr.utils.Dd.dd;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("p1", 1, "m");
        Employee e1 = new Employee("e1", 1, "s");
        Person p2 = new Employee("p2", 2, "x");
        String[] t1 = { "a", "b", "c" };
        dd(p2);
    }
}
