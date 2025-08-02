import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer, 1);
        for (int i = 1, acc = 1; i < nums.length; i++) {
            acc *= nums[i - 1];
            answer[i] *= acc;
        }
        for (int i = nums.length - 1, acc = 1; i > 0; i--) {
            acc *= nums[i];
            answer[i - 1] *= acc;
        }
        return answer;
    }
}