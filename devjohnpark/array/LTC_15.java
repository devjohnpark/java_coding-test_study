class LTC_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums); // 투포인터를 위해 정렬
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) { 
            // 이전에 추가했던 조합은 건너뛰기 (i 다음에 바로 j와 k가 오기때문에 i-1는 이미 포함됨)
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 기준점 중복 제거
            int j = i + 1; // 왼쪽 포인터
            int k = n - 1; // 오른쪽 포인터
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
	            // 합 0이면, 리스트에 추가
                    resultList.add(Arrays.asList(nums[i], nums[j], nums[k]));

     		    // 이전에 추가했던 조합은 건너뛰기
                    while (j < k && nums[j] == nums[j + 1]) j++; // j 중복 제거 
                    while (j < k && nums[k] == nums[k - 1]) k--; // k 중복 제거

                    j++;
                    k--;
                }
            }
        }
        return resultList;
    }
}
