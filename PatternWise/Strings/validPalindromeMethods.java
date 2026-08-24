public class validPalindromeMethods {

    public static boolean validpalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean validpalindrome1(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left <= right) {

            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(validpalindrome1(str));

    }
}
