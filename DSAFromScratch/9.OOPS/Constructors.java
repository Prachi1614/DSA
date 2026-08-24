public class Constructors {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("Tanya");

        f1.color = "Yellow";
        System.out.println("Color is : " + f1.color);
        System.out.println(f1.name);
    }
}

class Fruit{
    String color;
    int size;
    String name;

    Fruit(String name){
        System.out.println("'the name of the fruit is mango'");
        this.name = name;
    }
}
