import java.util.Scanner;

public class LargestOfTwoNumbers {

    public static void largestOfTwo(int a , int b){
        int largest = a;

        if(a < b){
            largest = b;
        }
        System.out.println("The largest number is : " + largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : " );
        int a = sc.nextInt();

        System.out.println("Enter num2 : " );
        int b = sc.nextInt();
        sc.close();
        
        largestOfTwo(a, b);
    }
}
