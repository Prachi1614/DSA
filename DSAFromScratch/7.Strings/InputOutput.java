import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str = sc.nextLine(); // It is used to hold the whole line.
        String str2 = sc.next(); // It is used only to hold single word. 

        System.out.println(str);
        System.out.println(str2);
    }
}
