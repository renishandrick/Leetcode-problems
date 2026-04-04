class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int max = 0;
        for (int i : prices) {
            if (i < minPrice) {
                minPrice = i;
            } else {
                max = Math.max(max, i - minPrice);
            }
        }

        return max;
    }
}