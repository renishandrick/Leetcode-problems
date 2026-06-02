class Solution {
    public String predictPartyVictory(String senate) {
        Queue <Integer> rad=new LinkedList<>();
        Queue <Integer> dire=new LinkedList<>();
        int n=senate.length();
        char ch[]=senate.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='R')
            rad.offer(i);
            else
            dire.offer(i);
        }
        while(!rad.isEmpty()&& !dire.isEmpty()){
            int r=rad.poll();
            int d=dire.poll();
            if(r<d){
                rad.offer(r+n);
            }
            else{
                dire.offer(d+n);
            }
        }
        return rad.isEmpty() ? "Dire" : "Radiant";
    }
}