package info.mikusr.Polymorphism.Zoo;

public class Zoo {
    public static void main(String[] args) {
        Dog fido = new Dog();

        fido.fetch();
        fido.makeSound();
        feed(fido);
        cast(fido);

        Animal bort = new Dog();
        bort.makeSound();

        bort = new Cat();
        bort.makeSound();
        cast(bort);

        ((Cat) bort).scratch();

        System.out.println(bort instanceof Dog);
        feed(bort);
    }

    public static void cast(Animal animal) {
        if (animal instanceof Cat cat) {
            cat.scratch();
        } else if (animal instanceof Dog dog) {
            dog.fetch();
        }
    }

    public static void feed(Animal animal) {
        if (animal instanceof Cat) {
            System.out.println("catfood");
        } else if (animal instanceof Dog) {
            System.out.println("dogfood");
        }
    }

}
