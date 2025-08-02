// 1. Two Sum(두 수의 합)

import java.util.*;

class Solution {  
    public int[] twoSum(int[] nums, int target) {        
        for(int i = 0; i < nums.length; i++ ) {
            for(int j = i + 1; j < nums.length; j++) {                
                int sum = nums[i] + nums[j];
        
                if(target == sum) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }
}

class Main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        
        int[] result = sl.twoSum(nums, 9);

        System.out.println(Arrays.toString(result));
    }
}