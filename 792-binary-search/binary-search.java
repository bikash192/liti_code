class Solution {
    public int check(int[] nums, int t, int s, int e) {
        int m = s + (e - s) / 2;
        if (s > e)
            return -1;
        if (nums[m] == t)
            return m;
        else if (nums[m] < t)
            return check(nums, t, m + 1, e);
        else
            return check(nums, t, s, m - 1);
    }

    public int search(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        return check(nums, target, s, e);
    }
}