import java.util.HashMap;

class Solution {
    public int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int digitSum = sum(num);

            if (map.containsKey(digitSum)) {
                maxSum = Math.max(maxSum, num + map.get(digitSum));
            }

            // Update the max number for this digit sum
            map.put(digitSum, Math.max(map.getOrDefault(digitSum, 0), num));
        }

        return maxSum;
    }
}
