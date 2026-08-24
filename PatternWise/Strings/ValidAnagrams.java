import java.util.Scanner;

public class ValidAnagrams {

    public static boolean checkingValidity(String s, String p) {
        if (s.length() != p.length()) {
            return false;
        }

        int freq[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[p.charAt(i) - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the str1 : ");
        String str1 = sc.nextLine();

        System.out.print("Enter the str2 : ");
        String str2 = sc.nextLine();

        boolean result = checkingValidity(str1, str2);
        System.out.print(result);
        sc.close();
    }
}
