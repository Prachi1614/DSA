public class Subsets {

    public static void subsets(String str , String ans , int i){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        // If yes
        subsets(str, ans+str.charAt(i), i+1);

        // If No
        subsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsets(str, "", 0);
    }
}
