public class longestPalindromicSubstring {

    public static String longestString(String str) {
        int start = 0, end = 0;
        if (str == null || str.length() < 2) {
            return str;
        }

        for (int i = 0; i < str.length(); i++) {
            int len1 = expand(str, i, i);
            int len2 = expand(str, i, i + 1);

            int len = Math.max(len1, len2);

            if ((end - start + 1) < len) {
                int leftpart = (len - 1) / 2;
                int rightpart = len / 2;

                start = i - leftpart;
                end = i + rightpart;
            }
        }
        return str.substring(start, end + 1);
    }

    public static int expand(String str, int i, int j) {
        while (i >= 0 && j < str.length() && str.charAt(i) == str.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
    }

    public static void main(String[] args) {
        String str = "babad";
        System.out.println(longestString(str));
    }
}
