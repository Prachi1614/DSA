import java.util.Scanner;

public class ReverseVowelsOfString {

    public static String vowelReversing(String s) {
        char[] arr = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            while (i < j && !isVowel(arr[i])) {
                i++;
            }
            while (i < j && !isVowel(arr[j])) {
                j--;
            }

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            j--;
            i++;
        }
        return new String(arr);
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        String reversedV = vowelReversing(str);

        System.out.println("The array is : " + reversedV);
        sc.close();
    }
}
