public class MaxOfThreeNums {

    public static int maxThreeNums(int num1 , int num2 , int num3){
        int max = num1;
        
        if (num2 > max){
            max = num2;
        }
        if (num3 > max){
            max = num3;
        }
        return max;
    }
    public static int maxOptimized(int a , int b , int c){
        int max = Math.max(a, Math.max(b , c));
        return max;
    }
    public static void main(String[] args) {
        // System.out.println(maxThreeNums(100, 300, 500));
        System.out.println(maxOptimized(100 , 200, 300));
    }
}
