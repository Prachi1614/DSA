import java.util.Scanner;

public class DecToBin {

    public static int decimalToBinary(int n){

        int power = 0;
        int bin = 0;

        while(n > 0){
            int rem = n % 2;
            bin = bin + (rem * (int)(Math.pow(10, power)));

            power++;
            n = n / 2;
        }
        return bin;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num : " );
        int n = sc.nextInt();

        System.out.println("The conversion is : " + decimalToBinary(n));
        sc.close();
    }
}
