import java.util.Scanner;

public class MinimumWindowSubstring {

    public static String minWinSStr(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        int freq[] = new int[256];

        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i)]++;
        }

        int left = 0, right = 0;
        int count = 0;
        int minlen = Integer.MAX_VALUE;

        int startIdx = -1;

        while (right < s.length()) {
            if (freq[s.charAt(right)] > 0) {
                count++;
            }
            freq[s.charAt(right)]--;
            right++;

            while (count == t.length()) {
                if (right - left < minlen) {
                    minlen = right - left;
                    startIdx = left;
                }
                freq[s.charAt(left)]++;
                if (freq[s.charAt(left)] > 0) {
                    count--;
                }
                left++;
            }
        }
        return startIdx == -1 ? "" : s.substring(startIdx, startIdx + minlen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the str1 : ");
        String str1 = sc.nextLine();

        System.out.print("Enter the str2 : ");
        String str2 = sc.nextLine();

        String result = minWinSStr(str1, str2);
        System.out.println("The result is : " + result);
        sc.close();
    }
}
