class Solution {
    public String getHint(String secret, String guess) {
        StringBuilder sb=new StringBuilder();
        char ch1[]=secret.toCharArray();
        char ch2[]=guess.toCharArray();
        int c=0;
        int cows=0;
        int j=0;
        int count[]=new int[10];
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]==ch2[i]){
                c++;
            }
            else{
                if(count[ch1[i]-'0']<0){
                    cows++;
                }
                if(count[ch2[i]-'0']>0){
                    cows++;
                }
                count[ch1[i]-'0']++;
                count[ch2[i]-'0']--;
            }
        }
        sb.append(c);
        sb.append("A");
        sb.append(cows);
        sb.append("B");
        return sb.toString();
    }
}