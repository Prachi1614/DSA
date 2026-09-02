import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {

    public static List<Integer> allAnagrams(String s , String p){
        List<Integer> ans = new ArrayList<>();

        if(s.length() < p.length()){
            return ans;
        }

        int left = 0;
        int freq[] = new int[26];

        for(int i = 0; i < p.length(); i++){
            freq[p.charAt(i) - 'a']++;
        }

        for(int right = 0; right < s.length(); right++){
            freq[s.charAt(right) - 'a']--;

            if(right - left + 1 > p.length()){
                freq[s.charAt(left) - 'a']++;
                left++;
            }

            if(right - left + 1 == p.length() && isAllZero(freq)){
               ans.add(left);
            }
        }
        return ans;
    }

    private static boolean isAllZero(int freq[]){
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "startupart";
        String t = "art";
        
        System.out.println(allAnagrams(s, t));
    }
}
