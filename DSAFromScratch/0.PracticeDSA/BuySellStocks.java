import java.util.Scanner;

public class BuySellStocks {

    public static int profitCalc(int prices[]){
        int max = 0;
        int buyingprice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            int sellingPrice = prices[i];
            if(buyingprice < sellingPrice){
                int profit = sellingPrice - buyingprice;
                max = Math.max(max, profit);
            }
            else{
                buyingprice = sellingPrice;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prices[] = new int[6];
        

        System.out.println("Enter the prices : " );
        for(int i = 0; i < prices.length; i++){
            prices[i] = sc.nextInt();
        }

        System.out.println("The profit is : " + profitCalc(prices));
        sc.close();
    }
}
