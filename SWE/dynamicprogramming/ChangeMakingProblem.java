package SWE.dynamicprogramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeMakingProblem {
    public static void main(String arg[]){
        ChangeMakingProblem buySellStock= new ChangeMakingProblem();
        int nums[]= {1,2,3};
        System.out.println(buySellStock.coinChange(nums,10));
    }

    public int coinChange(int[] coins, int amount) {
        if(coins.length==0 || amount==0)
            return 0;
        int[] dp= new int [amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;

        for(int coin :coins){
            for(int i=coin;i<=amount;i++){
                if(dp[i-coin] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], dp[i-coin]+1);
                }
            }
        }

        return  dp[amount]==Integer.MAX_VALUE ?-1:dp[amount];
    }
}
