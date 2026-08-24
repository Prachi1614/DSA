public class FindGridWays {

    public static int countGridWays(int n, int m, int i, int j) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else {
            if (i == n || j == n) {
                return 0;
            }
        }

        int w1 = countGridWays(n, m, i+1, j);
        int w2 = countGridWays(n, m, i, j+1);
        return w1 + w2;
    }

    public static void main(String[] args) {
        System.out.println(countGridWays(4, 4, 0, 0));
    }
}
