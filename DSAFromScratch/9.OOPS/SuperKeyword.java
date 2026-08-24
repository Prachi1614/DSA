public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("This is the constructor");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        super.color = "Brown";
        System.out.println("Constructor called");
    }
}
