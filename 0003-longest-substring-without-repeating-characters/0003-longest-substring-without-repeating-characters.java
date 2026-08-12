class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int maxlen=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}