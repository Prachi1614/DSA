import java.util.*;

public class FindAllAnagramsInString {

    public static List<Integer> anagramsStart(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int left = 0, right = 0;
        int windowsize = p.length();

        int freq[] = new int[26];

        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i) - 'a']++;
        }

        while (right < s.length()) {
            freq[s.charAt(right) - 'a']--;
            right++;

            if (right - left > windowsize) {
                freq[s.charAt(left) - 'a']++;
                left++;
            }

            if (right - left == windowsize && isAllzero(freq)) {
                result.add(left);
            }
        }
        return result;
    }

    private static boolean isAllzero(int freq[]) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Str1 : ");
        String str1 = sc.nextLine();

        System.out.print("Enter the Str2 : ");
        String str2 = sc.nextLine();

        List<Integer> result = anagramsStart(str1, str2);
        System.out.println("The result is : " + result);
        sc.close();
    }
}
