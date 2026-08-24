import java.util.*;

public class FindAllAnagramsInString {

    public static List<Integer> anagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        if(s.length() < p.length()){
            return res;
        }

        int left = 0;
        int right = 0;
        int windowsize = p.length();

        int freq[] = new int[26];
        for(int i = 0; i < p.length(); i++){
            freq[p.charAt(i) - 'a']++;
        }

        while(right < s.length()){
            freq[s.charAt(right) - 'a']--;
            right++;

            if(right - left > windowsize){
                freq[s.charAt(left) - 'a']++;
                left++;
            }

            if(right - left == windowsize && isAllZero(freq)){
                res.add(left);
            }
        }
        return res;
    }

    private static boolean isAllZero(int freq[]) {
        for(int i = 0; i < freq.length; i++){
           if(freq[i] != 0){
            return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(anagrams(s, p));
    }
}
