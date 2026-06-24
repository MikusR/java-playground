package info.mikusr.interfaces.library;

public interface Product {

    String getName();

    void setName(String name);

    default double getPrice() {
        return 50;
    };

    void setPrice(double price);
}
