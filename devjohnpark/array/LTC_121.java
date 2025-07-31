class LTC_121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; // 1. 이익의 최대값을 `0`으로 초기화한다.
        int min = prices[0]; // 2. 지정된 배열 요소 전까지의 최소값을 첫번째 배열 요소값으로 초기화
        int n = prices.length;
		// 3. 배열을 순회하면서 하나씩 요소값을 지정한다.
		for (int i = 1; i < n; i++) {
	        // 4. 지정된 배열 요소값과 지정된 배열 요소 전까지의 최솟값의 차이를 이익의 최대값으로 업데이트
            maxProfit = Math.max(prices[i] - min, maxProfit); 

			// 5. 지정된 배열 요소값과 지정된 배열 요소 전까지의 최솟값을 비교해서 작은값으로 지정된 배열 요소 전까지의 최솟값을 업데이트
            min = Math.min(prices[i], min); 
        }
        return maxProfit; // 6. 이익의 최댓값 반환
    }
}
