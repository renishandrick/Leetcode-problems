class Solution {
    public int maxProfit(int[] prices) {
       int minPrizes=Integer.MAX_VALUE;
       int max=0;
       for(int i:prices){
          if(i<minPrizes){
            minPrizes=i;
          }
          else
          max=Math.max(max,i-minPrizes);
       }
       return max;
    }
}