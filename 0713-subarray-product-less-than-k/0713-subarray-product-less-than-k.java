class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         if(k<=1)
            return 0;
        int prod=1;
        int c=0;
        int ws=0;
        for(int we=0;we<nums.length;we++){
            prod*=nums[we];
            while(prod>=k){
                prod/=nums[ws];
                ws++;
            }
            c+=we-ws+1;
        }
        return c;
    }
}