class Solution {
    public int trap(int[] height) {
        int leftmax = height[0];
        int l = height.length;
        Stack<Integer> s = new Stack<>();
        s.push(height[l-1]);
        for(int i=l-1;i>=2;i--){
            s.push(Math.max(height[i],s.peek()));
        }
        int water = 0;
        for(int i=1;i<l-1;i++){
            int minheight = Math.min(leftmax,s.peek());
            water+=Math.max(0,minheight-height[i]);
            s.pop();
            leftmax=Math.max(leftmax,height[i]);
        }
        return water;
    }
}