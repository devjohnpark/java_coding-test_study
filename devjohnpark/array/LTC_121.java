class LTC_121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        int n = prices.length;
        for (int i = 1; i < n; i++) {
            maxProfit = Math.max(prices[i] - min, maxProfit); // 1. 배열을 순회하면서 이익 최대값 업데이트
            min = Math.min(prices[i], min); // 2. 배열을 순회하면서 요소값중 최솟값 업데이트
        }
        return maxProfit; // 3. 이익 최댓값 반환
    }
}
