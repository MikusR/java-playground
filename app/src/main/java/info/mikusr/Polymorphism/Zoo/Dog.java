package info.mikusr.Polymorphism.Zoo;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Vau");
    }

    public void fetch() {
        System.out.println("fetch");
    }
}
