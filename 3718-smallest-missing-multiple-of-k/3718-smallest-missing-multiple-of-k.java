class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int x=k;
        while(set.contains(x)){
            x+=k;
        }
        return x;
    }
}