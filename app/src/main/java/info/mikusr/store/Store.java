package info.mikusr.store;


public class Store {
    public static void main(String[] args) {
        Item item1 = new Item(1, "item1");
        Item item2 = new Book(1, "item2", "red");
        Book item3 = new Book(1, "item3", "blue");
        System.out.println(item1.getClass());
        System.out.println(item2.getClass());
        System.out.println(item3.getClass());
    }
}
