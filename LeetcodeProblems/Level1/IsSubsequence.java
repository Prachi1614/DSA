public class IsSubsequence {

    public static boolean subsequence(String s , String t){
        int i = 0;
        int j = 0;

        char[] sr = s.toCharArray();
        char[] tr = t.toCharArray();

        while (i < sr.length && j < tr.length) {
            if(sr[i] == tr[j]){
                i++;
            }
            j++;
        }
        return i == sr.length;
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        System.out.println(subsequence(s, t));
    }
}
