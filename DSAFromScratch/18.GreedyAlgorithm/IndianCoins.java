import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {

    public static int coinChange(Integer coins[]) {
        Arrays.sort(coins, Comparator.reverseOrder());

        ArrayList<Integer> ans = new ArrayList<>();
        int maxCount = 0;
        int amount = 590;

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    maxCount++;
                    ans.add(coins[i]);
                    amount = amount - coins[i];
                }
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
        return maxCount;
    }

    public static void main(String[] args) {
        Integer coins[] = { 2000, 500, 100, 50, 20, 10, 5, 2, 1 };
        System.out.println(coinChange(coins));
    }
}
