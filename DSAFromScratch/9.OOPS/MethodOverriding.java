public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.Sound();
    }
}

//Parent and child classes both contain the same function with ifferent definition
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
