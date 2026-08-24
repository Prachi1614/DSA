public class Polymorphism {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.Draw();
        s.Draw(3);
    }
}
// Method Overloading --
/*
Same Method name with different Parameters.
 */
class Shape{
    void Draw(){
        System.out.println("WOW Nice Drawing");
    }

    void Draw(int radius){
        System.out.println("Nice drawing " + radius);
    }
}

//Method OverRiding -- 
/*Means making the same function again in the derieved class for some another purpose 
having same method name */
class Animal{
    void Sound(){
        System.out.println("Animal makes sounds");
    }
}
class Dog extends Animal{
    @Override
    void Sound(){
        System.out.println("Dog Barks");
    }
}

