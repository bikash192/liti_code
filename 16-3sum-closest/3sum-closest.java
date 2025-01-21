class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array
        int closestSum = Integer.MAX_VALUE / 2; // Initialize to a large value
        
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1; // Two-pointer setup
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                // Update closest sum if the current sum is closer to the target
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }
                
                // Adjust pointers based on the comparison
                if (sum < target) {
                    j++; // Increase sum by moving the left pointer
                } else if (sum > target) {
                    k--; // Decrease sum by moving the right pointer
                } else {
                    // Exact match found
                    return sum;
                }
            }
        }
        return closestSum;
    }
}
