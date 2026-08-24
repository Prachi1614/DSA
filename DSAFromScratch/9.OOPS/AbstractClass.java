public class AbstractClass {
    public static void main(String[] args) {
        Bulldog b = new Bulldog();
        // Dog d = new Dog();
        // d.walk();

        // Chicken c = new Chicken();
        // c.walk();

        // System.out.println(d.color);
        // }
    }
}

abstract class Animal {
    Animal() {
        System.out.println("Constructors called");
    }

    String color;

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Dog extends Animal {

    Dog() {
        System.out.println("Constructoe called");
    }

    void changeColor() {
        color = "Dark brown";
    }

    void walk() {
        System.out.println("Dogs walk on four legs");
    }
}

class Bulldog extends Dog {
    Bulldog() {
        System.out.println("Constructors called");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Wlks on two legs");
    }

    void changeColor() {
        color = "Dark yellow";
    }
}
