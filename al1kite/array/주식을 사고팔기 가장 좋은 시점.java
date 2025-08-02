class Solution {
    public int maxProfit(int[] prices) {
        int[] leftMin  = new int[prices.length];
        int[] rightMax = new int[prices.length];

        leftMin[0] = prices[0];
        for (int i = 1; i < prices.length; i++)
            leftMin[i] = Math.min(leftMin[i - 1], prices[i]);

        rightMax[prices.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--)
            rightMax[i] = Math.max(rightMax[i + 1], prices[i]);

        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++)
            maxProfit = Math.max(maxProfit, rightMax[i] - leftMin[i]);

        return maxProfit;
    }
}