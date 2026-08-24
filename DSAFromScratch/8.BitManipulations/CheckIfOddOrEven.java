import java.util.Scanner;

public class CheckIfOddOrEven {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bitmask = 1;
        if((n & bitmask) == 1){
        System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is an even number");
        }
    }
}
