class LTC_42 {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left]; // 1. 왼쪽 최대값을 첫번째 요소값으로 초기화한다.
        int rightMax = height[right]; // 2. 오른쪽 최대값을 마지막 요소값으로 초기화한다.
        int water = 0;
        // 3. 왼쪽 포인터가 오른쪽 포인터보다 작을 경우 반복한다.
        while (left < right) {
            // 주의점: 현재 조회하는 벽이 이전까지의 벽의 높이와 같거나 높은 경우, 고이는 물이 0이므로 최대값을 구할때 현재 조회하는 벽도 포함시켜야한다. 따라서 현재 조회한 값과 비교해서 왼쪽 오른쪽 최대값을 먼저 구한다.
            leftMax = Math.max(height[left], leftMax);
            rightMax = Math.max(height[right], rightMax);

            if (leftMax <= rightMax) { // 4. 왼쪽 최대값이 오른쪽 최대값보다 작거나 같을 경우, 왼쪽 포인터를 오른쪽으로 이동시키고 물의 양에 `왼쪽 최대값` - `물의 양에 현재 조회한 값` 더한다.

                water += leftMax - height[left];
                left++;
            } else { // 5. 오른쪽 최대값이 왼쪽 최대값보다 작은 경우, 오른쪽 포인터를 왼쪽으로 이동시키고 물의 양에 `오른쪽 최대값` - `물의 양에 현재 조회한 값` 더한다.
                water += rightMax - height[right];
                right--;
            }
        }
        return water; // 6. 합산된 물의 양을 반환한다.
    }
}
