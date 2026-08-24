import java.util.Scanner;

public class Factorial {

    public static int fact(int n){
        int facto = 1;
        for(int i = 1; i <= n; i++){
           facto = facto*i;
        }
        return facto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : " );
        int n = sc.nextInt();

        System.out.println(fact(n));

        sc.close();
    }
}
