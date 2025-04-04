class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for (int i = 0; i <= n - 3; i++) {
           if (nums[i] == 0) {
                // Flip nums[i], nums[i+1], nums[i+2]
                nums[i] ^= 1;
                nums[i+1] ^= 1;
                nums[i+2] ^= 1;
                cnt++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != 1)
                return -1;
        }
        return cnt;
    }
}