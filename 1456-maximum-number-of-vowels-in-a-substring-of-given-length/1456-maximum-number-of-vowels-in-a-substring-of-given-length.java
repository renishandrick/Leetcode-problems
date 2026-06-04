class Solution {
    public static boolean vowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        return true;
        return false;
    }
    public int maxVowels(String s, int k) {
       int max=0;
       int c=0;
       int ws=0;
       for(int we=0;we<s.length();we++){
            char ch=s.charAt(we);
            if(vowel(ch)){
                c++;
            }
            if(we>=k){
                if(vowel(s.charAt(ws))){
                    c--;
                }
                ws++;
            }
            max=Math.max(max,c);
       }
       return max;
    }
}