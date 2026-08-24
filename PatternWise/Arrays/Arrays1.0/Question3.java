public class Question3 {

    public static int sellingBuyingStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE; 
        int Maxprofit = 0;
        for(int i = 0; i < prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                Maxprofit = Math.max(Maxprofit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return Maxprofit;
    }
     public static void main(String[] args) {
        int prices [] = {7 , 6 , 4 , 3 , 1};
        System.out.println(sellingBuyingStocks(prices));
     }   
}
