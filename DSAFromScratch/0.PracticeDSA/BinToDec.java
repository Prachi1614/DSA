import java.util.Scanner;

public class BinToDec {

    public static int BinaryToDec(int n) {

        int power = 0;
        int dec = 0;

        while (n > 0) {
            int LD = n % 10;
            dec = dec + (LD * (int) Math.pow(2, power));

            power++;
            n = n / 10;
        }
        return dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num : ");
        int n = sc.nextInt();

        System.out.println("The conversion is : " + BinaryToDec(n));
        sc.close();
    }
}
