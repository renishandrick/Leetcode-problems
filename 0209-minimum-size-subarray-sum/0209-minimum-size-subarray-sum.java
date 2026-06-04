class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minsum=Integer.MAX_VALUE;
        int sum=0;
        int ws=0;
        for(int we=0;we<nums.length;we++){
            sum+=nums[we];
            while(sum>=target){
                minsum=Math.min(minsum,we-ws+1);
                sum=sum-nums[ws];
                ws++;
            }
        }
        return minsum==Integer.MAX_VALUE?0:minsum;
    }
}