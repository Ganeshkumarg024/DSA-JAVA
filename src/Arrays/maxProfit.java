package Arrays;

public class maxProfit {
    public static void main(String[] args) {
       int [] prices = {7, 1, 5, 3, 6, 4};
       bruteforce(prices);
       optimal(prices);

    }
    public static void bruteforce(int [] prices){
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                maxprofit=Math.max(maxprofit,prices[j]-prices[i]);
            }
        }
        System.out.println(maxprofit);
    }
    public static void optimal(int [] prices){
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }else{
                profit=Math.max(profit,prices[i]-min);
            }
        }

        System.out.println(profit);
    }
}
