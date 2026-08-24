import java.util.Scanner;

public class SubsequenceCheck {

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        char[] sr = s.toCharArray();
        char[] tr = t.toCharArray();

        while (i < sr.length && j < tr.length) {
            if (sr[i] == tr[j]) {
                i++;
            }
            j++;
        }
        return i == sr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string 1: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the String 2 : ");
        String str2 = sc.nextLine();

        boolean b = isSubsequence(str1, str2);
        System.out.println(b);
        sc.close();
    }
}
