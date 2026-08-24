public class MergeStringsAlternately {

    public static String mergeAlt(String w1 , String w2){
        StringBuilder sb = new StringBuilder("");
        int i = 0; 
        int j = 0;

        while (i < w1.length() && j < w2.length()) {
            sb.append(w1.charAt(i));
            sb.append(w2.charAt(j));
            i++;
            j++;
        }
        while (i < w1.length()) {
            sb.append(w1.charAt(i));
            i++;
        }
        while (j < w2.length()) {
            sb.append(w2.charAt(j));
            j++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String w1 = "ab";
        String w2 = "pqrst";

        System.out.println(mergeAlt(w1, w2));
    }
}
