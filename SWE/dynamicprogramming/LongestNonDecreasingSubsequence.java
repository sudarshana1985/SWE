package SWE.dynamicprogramming;

import java.util.Arrays;

public class LongestNonDecreasingSubsequence {
    public static void main(String arg[]){
        LongestNonDecreasingSubsequence subsequence= new LongestNonDecreasingSubsequence();
        int nums[]= {20,30,30,20,19,90};
        System.out.println(subsequence.lengthOfLNDS(nums));
    }

    public int lengthOfLNDS(int[] nums) {
        if(nums.length==0)
            return 0;
        int [] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int max=0;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<=nums[i])
                    dp[i]= Math.max(dp[j]+1,dp[i]);
            }
        }
        for(int val:dp){
            max=Math.max(max,val);
        }
        return max;
    }
}
