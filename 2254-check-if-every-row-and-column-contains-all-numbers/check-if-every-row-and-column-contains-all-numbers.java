class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        
        for (int i = 0; i < n; i++) {
            Set<Integer> rowSet = new HashSet<>();
            Set<Integer> colSet = new HashSet<>();
            
            for (int j = 0; j < n; j++) {
                // Row validation
                if (!rowSet.add(matrix[i][j])) {
                    return false;
                }
                // Column validation
                if (!colSet.add(matrix[j][i])) {
                    return false;
                }
            }
        }
        return true;
    }
}