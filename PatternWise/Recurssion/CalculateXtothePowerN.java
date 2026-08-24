public class CalculateXtothePowerN {

    public static int xPower(int x , int n){
        if(n == 0){
            return 1;
        }

        return x * xPower(x, n-1);
    }

    public static int optimizedPower(int x , int n){
        if(n == 0){
            return 1;
        }

        int halfpow = optimizedPower(x, n/2);
        int halfpowSq = halfpow * halfpow;

        if(n % 2 != 0){
            return x * halfpowSq;
        }
        return halfpowSq;
    }
    public static void main(String[] args) {
        // System.out.println(xPower(2, 10));
        System.out.println(optimizedPower(2, 10));
    }
}
