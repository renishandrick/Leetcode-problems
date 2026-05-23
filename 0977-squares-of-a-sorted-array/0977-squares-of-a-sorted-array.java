class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int left=0;
        int right=nums.length-1;
        Arrays.sort(nums);
        return nums;
    }
}