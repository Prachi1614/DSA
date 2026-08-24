public class HybridInheritance {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.breed = "Mammal";
        Puppy p1 = new Puppy();
        p1.eat();
        p1.bark();
        p1.play();
    }
}

class Animal{
    String breed;
    void eat(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("Dogs bark!!");
    }
}

interface Pet {
    void play();
}

class Puppy extends Dog implements Pet{
    public void play(){
        System.out.println("Puppy plays");
    }
}
