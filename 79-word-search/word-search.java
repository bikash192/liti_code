class Solution {
    public boolean search(int i,int j,int m,int n,char[][]board,String word,int k){
        if(k==word.length()) return true;
        if(i<0||j<0||i>=n||j>=m||board[i][j]!=word.charAt(k)) return false;
        char temp=board[i][j];
        board[i][j]='.';
        boolean op1=search(i+1,j,m,n,board,word,k+1);
        boolean op2=search(i-1,j,m,n,board,word,k+1);
        boolean op3=search(i,j+1,m,n,board,word,k+1);
        boolean op4=search(i,j-1,m,n,board,word,k+1);
        board[i][j]=temp;
        return op1||op2||op3||op4;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(search(i,j,m,n,board,word,0)) return true;
                }
            }
        }
        return false;
    }
}