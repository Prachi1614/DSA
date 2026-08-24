public class binomialcoefficient {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int bincoeff(int n, int r) {
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nmr = factorial(n - r);

        int bcoeff = fac_n / (fac_r * fac_nmr);
        return bcoeff;
    }
    
    public static void main(String[] args) {
        int op = bincoeff(5, 4);
        System.out.println("The binomialCoefficient is : "  + op);
    }
}
