package SWE.dynamicprogramming;

public class BuySellStock {
    public static void main(String arg[]){
        BuySellStock buySellStock= new BuySellStock();
        int nums[]= {1,2,3,4,5,6};
        System.out.println(buySellStock.maxProfit(nums));
    }

    public int maxProfit1(int[] prices) {
        if(prices.length==0)
            return 0;
        int maxProfit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                maxProfit= Math.max(maxProfit,prices[j]-prices[i]);
            }
        }
        return maxProfit;
    }

    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;

        int maxProfit=0, minPriceSofar=prices[0];
        for(int i=1;i<prices.length;i++){
            maxProfit= Math.max(maxProfit,prices[i]-minPriceSofar);
            minPriceSofar=Math.min(minPriceSofar,prices[i]);
        }
        return maxProfit;
    }
}
