public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(10.2f, 11.5f));
        System.out.println(c.sum(10, 11));
        System.out.println(c.sum(10, 11 , 12));

    }

}

class Calculator{
    int sum(int a , int b){
        return a + b;
    }

    int sum(int a , int b , int c){
        return a + b + c;
    }

    float sum(float a , float b){
        return a + b;
    }
}
