public class MinimumWindowSliding {

    public static String solvedHard(String s, String t) {
        if (s.length() < t.length() || s == null || t == null) {
            return " ";
        }

        int left = 0;
        int right = 0;
        int minlen = Integer.MAX_VALUE;
        int startidx = -1;
        int count = 0;
        int freq[] = new int[256];

        for(int i = 0; i < t.length(); i++){
            freq[t.charAt(i)]++;
        }
        
        while(right < s.length()){
            if(freq[s.charAt(right)] > 0){
            count++;
            }
            freq[s.charAt(right)]--;
            right++;

            while(count == t.length()){
              if(right - left < minlen){
                minlen = right - left;
                startidx = left;
              }
              freq[s.charAt(left)]++;
              if(freq[s.charAt(left)] > 0){
                count--;
              }
              left++;
            }
        }
        if(startidx == -1){
            return " ";
        }

        return s.substring(startidx , minlen+startidx);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        
        System.out.println(solvedHard(s, t));
    }
}
