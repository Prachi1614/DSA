public class palindrome {

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("String is not Palindrome");
                return false;
            }
            i++;
            j--;
        }
        System.out.print("String is Palindrome");
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        isPalindrome(str);
    }
}
