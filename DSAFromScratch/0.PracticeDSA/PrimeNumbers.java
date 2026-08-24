import java.util.*;
public class PrimeNumbers {

    public static boolean isPrime(int a){
        if(a <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= a){
            if(a % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : " );
        int a = sc.nextInt();
        
        boolean res = isPrime(a);
        System.out.println(res);

        if(res == true){
            System.out.println("The number is a prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
        sc.close();
    }
}
