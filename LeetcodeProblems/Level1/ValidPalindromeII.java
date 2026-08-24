public class ValidPalindromeII {

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while(left <= right){
            if(str.charAt(left) != str.charAt(right)){
                return isValid(str, left+1, right) || 
                       isValid(str, left, right-1);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isValid(String str , int left , int right){
        while(left <= right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
       String str = "abcda";
       System.out.println(isPalindrome(str));
    }
}
