public class LTC_1 {
	public int[] twoSum(int[] nums, int target) {
		int n = nums.length;
		// 1. `HashMap`에 배열 요소를 모두 입력한다.
		HashMap<Integer, Integer> hashMap = new HashMap<>(); // 인덱스가 반환할 데이터이므로, 요소 값을 key로 요소 인덱슬르 value로 저장
	
		// 값을 먼저 출력하고 입력하므로 동일한 인덱스 값의 합은 경우의 수에서 제거
		for (int i = 0; i < n; i++) {
			// 2. 기준점으로 지정할 배열을 순회하면서 `HashMap`에서 `target - 기준점 요소의 값`을 출력한다.
			Integer idx = hashMap.get(target - nums[i]); // 배열 요소의 합이 target인지 확인
			if (idx != null) { // 3. 배열 요소의 합이 target 경우 두 배열의 요소를 반환하고, 없다면 2번을 반복한다.
				return new int[]{i, idx}; // 두 요소의 인덱스 반환
			}
			hashMap.put(nums[i], i); // 배열 요소 입력
		}
		return new int[]{}; // 문제의 답은 항상 하나 존재해서 반환 안함
	}
}
