class Solution {
    public void nqueen(char[][]board,int row,List<List<String>> ans,int n){
        List<String> st=new ArrayList<>();
        if(row==n){

            for(int i=0;i<n;i++){
                String s="";
                for(int j=0;j<n;j++){
                    s+=board[i][j];
                }
                st.add(s);
            }
            ans.add(st);
            return ;
        }
        for(int j=0;j<board.length;j++){
            if(isvalid(board,row,j,n)){
                board[row][j]='Q';
            nqueen(board,row+1,ans,n);
            board[row][j]='.';
            }
        }
    }
    public boolean isvalid(char[][]board,int row,int col,int n){
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false; 
    }
    
        int i=row-1,j=col-1;
         while(i>=0&&j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        i=row-1;j=col+1;
        while(i>=0&&j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        return true;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nqueen(board,0,ans,n);
        return ans;
    }
}