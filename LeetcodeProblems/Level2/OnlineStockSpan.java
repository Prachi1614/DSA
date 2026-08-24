import java.util.Stack;

public class OnlineStockSpan {

    public static void spanStocks(int prices[]) {
        Stack<Integer> s = new Stack<>();
        int span[] = new int[prices.length];
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < prices.length; i++) {
            int curr = prices[i];
            while (!s.isEmpty() && curr > prices[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevhigh = s.peek();
                span[i] = i - prevhigh;
            }
            s.push(i);
        }
        for(int i = 0; i < span.length; i++){
            System.out.print(span[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int prices[] = { 100, 80, 60, 70, 60, 75, 85 };
        spanStocks(prices);
    }
}
