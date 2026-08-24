public class StringCompression {
    /*String is aaabbcccdd now we want to write it as a3b2c3d2 form writing the count
    infront of the repeated letter */

    public static String compressingString(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String str = "aaabbcd";
        System.out.println(compressingString(str));
    }
}
