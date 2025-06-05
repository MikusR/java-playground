package main.java;
public class Classes {

    public static void main(String[] args) {
        Knife knife1 = new Knife();
        Knife knife2 = new Knife("maker1", 3);
        Knife knife3 = new SwissKnife("maker2", 4, 54);
        System.out.println(knife1);
        System.out.println(knife2);
        System.out.println(knife3);
    }
}

class Knife {
    String maker;
    int length;

    public Knife() {
        this("none", 1);
    }

    public Knife(String maker, int length) {
        this.maker = maker;
        this.length = length;
    }

    @Override
    public String toString() {
        return "This is a Knife made by " + this.maker + " and is " + this.length + " long";
    }
}

class SwissKnife extends Knife {
    int functions;

    public SwissKnife() {
        super();
        this.functions = 0;
    }

    public SwissKnife(String maker, int length, int functions) {
        super(maker, length);
        this.functions = functions;
    }

    @Override
    public String toString() {
        return "This is a SwissKnife made by " + this.maker +
                ", has " + this.functions +
                " functions and is " + this.length + " long";
    }
}