package SWE.dynamicprogramming;

public class MaxContiguousSubarraySum {
    public static void main(String arg[]){
        MaxContiguousSubarraySum subarraySum= new MaxContiguousSubarraySum();
        int nums[]= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(subarraySum.maxContiguousSubarraySum(nums));
    }

    public int maxContiguousSubarraySum(int[] nums) {
        int max=nums[0], sum=nums[0];
        if(nums.length==0)
            return 0;
        for(int i=1;i<nums.length;i++){
            sum= Math.max(sum+nums[i], nums[i]);
            max= Math.max(sum,max);
        }
        return  max;
    }
}
