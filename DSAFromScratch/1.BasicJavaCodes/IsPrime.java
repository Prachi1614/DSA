import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int num = sc.nextInt();
        int c = 2;
        boolean isprime = true;

        if (num == 2) {
            System.out.println("The number is a prime number");
        }
        while (c * c <= num) {
            if (num % c == 0) {
                isprime = false;
                break;
            }
            c++;
        }

            if (isprime) {
                System.out.println("The number is a prime number");
            } else {
                System.out.println("The number is not a prime number");
            }
        
    }
}
