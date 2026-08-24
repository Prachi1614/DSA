public class PrintThePowerOfX {

    public static int power(int x , int n){
        if(n == 0){
            return 1;
        }
        // int xNM1 = power(x, n - 1);
        // int xN = x * xNM1;
        // return xN;
        return x * power(x, n - 1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
