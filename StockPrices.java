public class StockPrices {
    public static int maxProfit(int[] stocks){
        int buy_price = stocks[0];
        int days = stocks.length;
        int max_profit = 0;

        for (int i = 0; i<days; i++){
            if (stocks[i]<buy_price){
                buy_price=stocks[i];
            }
            else{
                int current_profit = stocks[i]-buy_price;
                max_profit = Math.max(max_profit, current_profit);
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        
        int[] stocks = {7,2,1,4,5,6};
        int max_profit = maxProfit(stocks);
        System.out.println(max_profit);
    }
}
