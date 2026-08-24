public class ReverseVowelsOfAString {

    public static String reverseVowel(String s) {
        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

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

            i++;
            j--;
        }
        return new String(arr);
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowel(s));
    }
}
