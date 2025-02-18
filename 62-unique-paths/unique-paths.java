class Solution {
    public int uniquePaths(int m, int n) {
        long res = 1;
        int steps = m + n - 2;  // Total steps to reach bottom-right
        int down = Math.min(m - 1, n - 1);  // Choose the smaller of (m-1) or (n-1)
        
        for (int i = 0; i < down; i++) {
            res = res * (steps - i) / (i + 1); // Compute nCr using iterative division
        }
        
        return (int) res;
    }
}
