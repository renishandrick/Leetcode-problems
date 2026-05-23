class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.toLowerCase();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='0' && ch[i]<='9')){
                sb.append(ch[i]);
            }
        }
        if(sb.toString().equals(sb.reverse().toString()))
        return true;
        return false;
    }
}