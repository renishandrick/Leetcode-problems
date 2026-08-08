class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int c=0;
            int j=0;
            while(j<nums.length){
                int max=nums[i];
                if(nums[j]<max){
                    c++;
                }
                j++;
            }
            a[i]=c;
        }
        return a;
    }
}