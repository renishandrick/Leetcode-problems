class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack <Integer> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums2){
            while(!st.isEmpty()&& i>st.peek()){
                map.put(st.pop(),i);
            }
            st.push(i);
            
        }while(!st.isEmpty()){
                map.put(st.pop(),-1);
            }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }
}