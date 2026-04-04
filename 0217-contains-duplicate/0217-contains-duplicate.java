class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>ren=new HashSet<>();
        for(int i:nums)
        ren.add(i);
        if(ren.size()==nums.length)
        return false;
        return true;

    }
}