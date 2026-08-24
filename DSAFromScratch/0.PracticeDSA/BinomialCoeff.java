import java.util.Scanner;

public class BinomialCoeff {

    public static int factorial(int n){
        int fac = 1;
        for(int i = 1; i <= n; i++){
            fac = fac*i;
        }
        return fac;
    }

    public static int bino_coeff(int n , int r){
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nr = factorial(n - r);

        int bino_coef= fac_n / (fac_r*fac_nr);
        return bino_coef;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the num1 : ");
        int n = sc.nextInt();

        System.out.print("Enter the num2 : ");
        int r = sc.nextInt();

        System.out.println("The result is : " + bino_coeff(n, r));
        sc.close();
    }
}
