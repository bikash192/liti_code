
class Solution {
    public boolean isPossible(int[] r, int c, long m) {
        long sum = 0;
        for (int i = 0; i < r.length; i++) {
            sum += (long) Math.sqrt(m / (double) r[i]);
            if (sum >= c) return true; // Early exit if condition is met
        }
        return false;
    }

    public long repairCars(int[] ranks, int cars) {
        long l = 1;
        long h = 1L * Arrays.stream(ranks).min().getAsInt() * (long) cars * cars; // Better upper bound
        long ans = 0;
        
        while (l <= h) {
            long m = l + (h - l) / 2;
            if (isPossible(ranks, cars, m)) {
                ans = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }
}
