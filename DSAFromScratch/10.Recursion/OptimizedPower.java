public class OptimizedPower {

    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }

        int halfpower = optimizedPower(a, n/2);
        int opower = halfpower * halfpower;

        //If n is ODD

        if(n % 2 != 0){
            opower = opower * a;
        }
        return opower;
    }

    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 10));
    }
}
