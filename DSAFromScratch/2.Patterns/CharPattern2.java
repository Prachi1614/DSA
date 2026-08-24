import java.util.Scanner;

public class CharPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int line = 1; line <= n; line++) {
            char ch = 'A';
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }
    }
}
