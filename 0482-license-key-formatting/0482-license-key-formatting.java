class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c!='-'){
                sb2.append(c);
            }
        }
        String r=sb2.reverse().toString();
        int count=0;
        for(int i=0;i<r.length();i++){
            sb.append(r.charAt(i));
            count++;
            if(count==k && i!=r.length()-1){
                sb.append("-");
                count=0;
            }
        }
        return sb.reverse().toString().toUpperCase();   
    }
}