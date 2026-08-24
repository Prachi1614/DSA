public class ExampleQuestion {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatsNonVeg();
        b.eatsVeg();
    }
}

interface Harbivore{
    void eatsVeg();
}

interface Carnivore{
    void eatsNonVeg();
}

class Bear implements Harbivore , Carnivore{
    public void eatsVeg(){
        System.out.println("Bear Eats leafs , veggies ets");
    }
    public void eatsNonVeg(){
        System.out.println("Bear also eats animals, fish, meat");
    }
}
