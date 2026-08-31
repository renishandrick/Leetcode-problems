class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb=new StringBuilder();
        char ch[]=s.toCharArray();
        int c=0;
        StringBuilder ans=new StringBuilder();
        for(char i:ch){
            if(i!='-'){
                sb.append(Character.toUpperCase(i));
            }
        }
        for(int i=sb.length()-1;i>=0;i--){
            if(c==k){
                ans.append('-');
                c=0;
            }
            ans.append(sb.charAt(i));
            c++;
        }
        return ans.reverse().toString(); 
    }
}