package SWE.dynamicprogramming;

public class MaximumSumCircularArray {
    public static void main(String arg[]){
        MaximumSumCircularArray subarraySum= new MaximumSumCircularArray();
        int nums[]= {3,-2,2,-3};
        System.out.println(subarraySum.maxCircularSubarraySum(nums));
    }
    public int maxCircularSubarraySum(int[] nums) {
        if(nums.length==0)
            return 0;
        int sum=nums[0];
        int max=nums[0];


        if(nums[0]==nums[nums.length-1]){
            for(int i=1;i<nums.length;i++){

                sum= Math.max(sum+nums[i],nums[i]);
                max= Math.max(max,sum);
            }
            sum= Math.max(sum+nums[0],nums[0]);
            max= Math.max(max,sum);
        }
        else{
            for(int i=1;i<nums.length;i++){
                if(sum+nums[i]> sum)
                    sum=sum+nums[i] ;


                max= Math.max(max,sum);
            }
        }

        return max;
    }
}
