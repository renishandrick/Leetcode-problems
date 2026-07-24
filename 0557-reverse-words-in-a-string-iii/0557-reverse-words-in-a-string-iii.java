class Solution {
    public String reverseWords(String s) {
        String a[]=s.split("\\s+");
        String ans="";
        for(int i=0;i<a.length;i++){
            StringBuilder sb=new StringBuilder();
            sb.append(a[i]);
            sb.reverse();
            ans+=sb.toString();
            if(i!=a.length-1){
                ans+=" ";
            }
        }
        return ans;
    }
}