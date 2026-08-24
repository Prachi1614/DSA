import java.util.Scanner;

public class IncomeTax {

    public static long income(long n) {
        int tax = 0;
        if (n < 500000) {
            tax = 0;
        } else if (n > 500000 && n < 1000000) {
            tax = (int) (0.2 * n);
        } else if (n > 1000000 && n < 2000000) {
            tax = (int) (0.5 * n);
        } else {
            System.out.println("get on big calculations");
        }
        return tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the income : ");
        long n = sc.nextLong();

        System.out.println("The tax calculated is : " + income(n));
        sc.close();
    }
}
