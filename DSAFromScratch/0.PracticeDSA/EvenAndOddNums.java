public class EvenAndOddNums {

    public static void evenOdd(int n){
        if(n % 2 == 0){
            System.out.println("The number is even number");
        }
        else{
            System.out.println("The number is an odd number");
        }
    }
    public static void main(String[] args) {
        evenOdd(6);
    }
}
