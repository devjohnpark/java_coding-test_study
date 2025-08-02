// 561. Array Partition(배열 파티션 1)

import java.util.*;

class Solution {
    public int arrayPairSum(int[] nums) {   
        // 1. 주어진 배열을 오름차순으로 정리한다.
        Arrays.sort(nums);

        int result = 0;
        
        // 2. 숫자 쌍에서 작은 값들의 합을 구한다.
        for(int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        
        // 3. 합을 반환한다
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = new int[]{1, 4, 3, 2};

        int answer = solution.arrayPairSum(nums);

        System.out.println(answer);
    }
}