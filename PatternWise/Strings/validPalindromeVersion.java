public class validPalindromeVersion {

    public static boolean palindromecheck(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return ispalindrome(s, left + 1, right) ||
                        ispalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean ispalindrome(String s, int left, int right) {
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            right--;
            left++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abca";
        System.out.println(palindromecheck(s));
    }
}
