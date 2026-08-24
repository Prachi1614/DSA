public class IsPalindrome {

    public static boolean palindrome(String str){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                System.out.println("Not a Palindrome!");
                return false;
            }
        }
        System.out.println("Is Palindrome!");
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(palindrome(str));
    }
}
