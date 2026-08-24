import java.util.Scanner;

public class PrintNumbersfrom1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
