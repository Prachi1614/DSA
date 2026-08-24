public class Inheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.breathe();
        
        // Fish f = new Fish();
        // f.swim();

        // f.breathe();

        Dog dobby = new Dog();
        // dobby.legs = 4;
        dobby.eat();
        dobby.breed = "DobberMan";
        // System.out.println(dobby.legs);
        dobby.color = "black";
        System.out.println(dobby.color);
        Cat c = new Cat();
        c.Meow();
        c.color = "White";
        System.out.println(c.color);

    }
}

// Single Level Inheritance.
class Animal{
    String color;

    void eat(){
        System.out.println("The animal Eats");
    }

    void breathe(){
        System.out.println("The animal Breathes");
    }
}

// class Fish extends Animal{
//     int Fins;

//     void swim(){
//         System.out.println("The Fish Swims");
//     }
// }

// Multi Level Inheritance.

// class Mammal extends Animal{
//     int legs;
// }

// class Dog extends Mammal{
//     String breed;
// }

// Hierarchial Inheritance 

class Dog extends Animal{
    String breed;

    void barks(){
    System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    String breed;

    void Meow(){
        System.out.println("Cat meows");
    }
}

