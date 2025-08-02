class LTC_561 {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        int max = 0;

        // 1. 배열을 오름 차순으로 정렬한다.
        Arrays.sort(nums);

        // 2. 인덱스를 2씩 증가시키며 요소값을 모두 더한다.
        for (int i = 0; i < n; i+=2) {
            max += nums[i];
        }

        // 3. 최대값 반환
        return max;
    }
}
