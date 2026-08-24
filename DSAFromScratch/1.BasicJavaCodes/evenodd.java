import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = sc.nextInt();

        int evensum = 0;
        int oddsum = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evensum += num;
            } else {
                oddsum += num;
            }
        }
        System.out.println("The sum of the even numbers are :" + evensum);
        System.out.println("The sum of the even numbers are :" + oddsum);
    }
}
