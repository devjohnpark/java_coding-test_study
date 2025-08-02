// 238. Product of Array Except Self(자신을 제외한 배열의 곱)

import java.util.*;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] result = new int[nums.length];
        int products = 1;
        
        // 왼쪽 곱
        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                left[i] = 1;
            } else {
                products *= nums[i - 1];
                left[i] = products;
            }
        }
        
        products = 1;

        // 오른쪽 곱
        for(int i = nums.length - 1; i >= 0; i--) {
            if(i == nums.length - 1) {
                right[i] = 1;
            } else {
                products *= nums[i + 1];
                right[i] = products;
            }
        }

        // 왼쪽 곱과 오른쪽 곱 결합 - 각 원소의 값 = (왼쪽 곱) x (오른쪽 곱)
        for(int i = 0; i < nums.length; i++) {
            result[i] = left[i] * right[i];
        }
    
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // int[] nums = new int[] {1, 2, 3, 4};
        int[] nums = new int[] {-1, 1, 0, -3, 3};

        int[] aswer = solution.productExceptSelf(nums);

        System.out.println(Arrays.toString(aswer));
    }
}