class Solution {
    public int maxProfit(int[] prices) {
        int minPrices=Integer.MAX_VALUE;
        int max=0;
        for(int i : prices){
            if(i<minPrices){
                minPrices=i;
            }
            else
            max=Math.max(max,i-minPrices);
        }
        return max;
    }
}