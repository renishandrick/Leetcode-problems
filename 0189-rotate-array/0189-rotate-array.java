class Solution {
    public void rotate(int[] nums, int k) {
        Queue <Integer> q=new LinkedList<>();
        k=k%nums.length;
        for(int i:nums){
            q.offer(i);
        }
        for(int i=0;i<nums.length-k;i++){
            q.offer(q.poll());
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=q.poll();
            System.out.print(nums[i]);
        }
    }
}