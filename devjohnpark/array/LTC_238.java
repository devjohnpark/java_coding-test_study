class LTC_238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        // 1. 결과값인 누적곱을 저장할 배열을 1로 초기화
        for (int i = 0; i < n; i++) {
            answer[i] = 1;
        }

		// 2. 왼쪽에서 오른쪽으로 순회하면서 누적곱 배열 요소에 누적해서 곱한다.
        for (int i = 0, left = 1; i < n; i++) {
            answer[i] *= left; 
            left *= nums[i]; 
        }

		// 3. 오른쪽에서 왼쪽으로 순회하면서 누적곱 배열 요소에 누적해서 곱한다.
        for (int i = n-1, right = 1; i >= 0; i--) {
            answer[i] *= right; 
            right *= nums[i];
        }
        return answer;
    }
}
