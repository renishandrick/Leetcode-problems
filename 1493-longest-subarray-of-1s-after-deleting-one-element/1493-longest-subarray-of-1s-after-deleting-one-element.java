class Solution {
    public int longestSubarray(int[] nums){
        int max=0;
        int z=0;
        int ws=0;
        for(int we=0;we<nums.length;we++){
            if(nums[we]==0){
                z++;
            }
            if(z>1){
                if(nums[ws]==0){
                    z--;
                }
                ws++;
            }
            max=Math.max(max,we-ws);
        }
        return max;
    }
}