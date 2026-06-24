package info.mikusr.Polymorphism.Zoo;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("I like mondays");
    }

    public void scratch() {
        System.out.println("scratch");
    }
}
