class Solution {
    public static boolean vowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        return true;
        return false;
    }
    public int maxVowels(String s, int k) {
       int max=0;
       int co=0;
       int ws=0;
       for(int we=0;we<s.length();we++){
         char c=s.charAt(we);
         if(vowel(c)){
            co++;
         }
         if(we>k-1){
            if(vowel(s.charAt(ws))){
                co--;
            }
            ws++;
         }
         max=Math.max(max,co);
       }
       return max;
    }
}