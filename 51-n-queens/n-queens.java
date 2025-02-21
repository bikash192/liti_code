class Solution {
    public void nqueen(char[][]board,int row,List<List<String>> ans){
        List<String> l=new ArrayList<>();
        int n=board.length;
        if(row==n){
            for(int i=0;i<n;i++){
                String str="";
                for(int j=0;j<n;j++){
                    str+=board[i][j];
                }
                l.add(str);
            }
            ans.add(l);
            return ;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nqueen(board,row+1,ans);
                board[row][j]='.';
            }
        }
    }
    public boolean isSafe(char[][]board,int row,int col){
        int n=board.length;
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q') return false;
        }
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }
        int i=row,j=col;
        while(i>=0&&j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        i=row;j=col;
        while(i>=0&&j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        i=row;j=col;
        while(i<n&&j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        i=row;j=col;
        while(i<n&&j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }
        return true;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nqueen(board,0,ans);
        return ans;
    }
}