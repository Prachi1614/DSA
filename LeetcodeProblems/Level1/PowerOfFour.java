public class PowerOfFour {

    public static boolean powerOfn(int n){
        while (n > 1) {
            if(n % 4 != 0){
                return false;
            }
            n = n / 4;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(powerOfn(n));
    }
}
