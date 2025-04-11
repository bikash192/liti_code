class Solution {
    public void solve(int row, int col, char[][] board, char[][] ans) {
        if (col == 9) {
            row++;
            col = 0;
        }
        if (col == 0 && row == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    ans[i][j] = board[i][j];
                }
            }
            return;
        }
        if (board[row][col] != '.') {
            solve(row, col + 1, board, ans);
        } else {
            for (char ch = '1'; ch <= '9'; ch++) {
                if (isValid(board, row, col, ch)) {
                    board[row][col] = ch;
                    solve(row, col + 1, board, ans);
                    board[row][col] = '.'; 
                }
            }
        }
    }

    public boolean isValid(char[][] board, int row, int col, char ch) {
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == ch) return false;
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch) return false;
        }
        int srow = row / 3 * 3;
        int scol = col / 3 * 3;
        for (int i = srow; i < srow + 3; i++) {
            for (int j = scol; j < scol + 3; j++) {
                if (board[i][j] == ch) return false;
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        char[][] ans = new char[9][9];
        solve(0, 0, board, ans);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = ans[i][j];
            }
        }
    }
}
