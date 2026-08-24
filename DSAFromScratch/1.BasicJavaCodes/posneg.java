import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        
        if(num > 0 ){
            System.out.println("The given number is positive");
        }
        else {
            System.out.println("The given number is negetive");
        }
    }
}
