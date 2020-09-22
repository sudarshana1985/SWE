package SWE.dynamicprogramming;

public class KnapSack {
    public static void main (String arg[]){
        KnapSack knapSack = new KnapSack();
        int[] values= {60,50,70,30};
        int [] weights={5,3,4,2};
        System.out.println(knapSack.knapsack(values,weights,5));
    }

    public int knapsack(int[] values, int[] weights, int maxWeightConstraint) {
        if(values.length==0 || weights.length==0)
            return  0;
        int [][] dp = new int [values.length+1][maxWeightConstraint+1];

        for(int i=0;i<=values.length;i++){
            for(int j=0;j<=maxWeightConstraint;j++){
                int çurrentItem = i - 1;
                if(i==0 || j==0)
                    dp[i][j]=0;
                else if(weights[çurrentItem]>j)
                    dp[i][j]=dp[i-1][j];
                else{
                    int choose= values[çurrentItem] + dp[i-1] [j-weights[çurrentItem]];
                    int dontChoose= dp[i-1][j];
                    dp[i][j]= Math.max(choose,dontChoose);
                }
            }
        }

        return dp[values.length][maxWeightConstraint];
    }
}
