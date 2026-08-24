public class ImmutableStrings {

    public static String immutableString(String str){
        String strr = "Tony";
        for(char ch = 'a'; ch <= 'z'; ch++){
            strr += ch;
        }
        return strr;
    }
    public static void main(String[] args) {
        System.out.println(immutableString(null));
    } 
}
