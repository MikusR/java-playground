package info.mikusr.store;

public class Book extends Item {
    String color;

    public Book(int price, String name, String color) {
        super(price, name);
        this.color = color;
    }
}
