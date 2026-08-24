public class butterfly {

    public static void butterFly(int n) {
        // Inner loop
        for (int i = 1; i <= n; i++) {
            // star print
            for (int j = 1; j <= i; j++) {
                System.err.print("*");
            }
            // space print
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.err.print("*");
            }
            // space print
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
           butterFly(5);
    }
}
