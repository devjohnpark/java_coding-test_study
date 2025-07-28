public class LCT_1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>(); // 인덱스가 반환할 데이터이므로, 요소 값을 key로 인덱스를 value로 저장
        for (int i = 0; i < n; i++) {
            // 값을 먼저 출력하고 입력하므로 동일한 인덱스 값의 합은 경우의 수에서 제거
            Integer idx = hashMap.get(target - nums[i]);
            if (idx != null) {
                return new int[]{i, idx};
            }
            hashMap.put(nums[i], i);
        }
        return new int[]{}; 
    }
}
