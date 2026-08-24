import java.util.Scanner;

public class longestPalindromicSubstring {

    public static String expandFromCenterAlgo(String s) {
        int start = 0, end = 0;

        if (s == null || s.length() < 2) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i + 1);
            int len2 = expand(s, i, i);

            int len = Math.max(len1, len2);

            int totallen = end - start + 1;
            if (totallen < len) {
                int leftpart = (len - 1) / 2;
                int rightpart = len / 2;

                start = i - leftpart;
                end = i + rightpart;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expand(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        String palindromicsub = expandFromCenterAlgo(str);
        System.out.println("The result is : " + palindromicsub);
        sc.close();
    }
}
