import java.util.Scanner;

public class reverseStrings {

    public static String reversetheString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left <= right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return new String(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String input = sc.nextLine();

        char arr[] = input.toCharArray();

        String result = reversetheString(arr);
        System.out.println("The reversed String is : " + result);
        sc.close();
    }
}
