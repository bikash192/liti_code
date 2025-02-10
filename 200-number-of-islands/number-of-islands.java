class Solution {
    public void dfs(int i,int j,int[][]vis,char [][]grid){
        int n=grid.length;
        int m=grid[0].length;
        if(i<0||j<0||i>=n||j>=m) return;
        if(vis[i][j]==1||grid[i][j]=='0') return;
        vis[i][j]=1;
        dfs(i-1,j,vis,grid);
        dfs(i+1,j,vis,grid);
        dfs(i,j-1,vis,grid);
        dfs(i,j+1,vis,grid);
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'&& vis[i][j]==0){
                    cnt++;
                    dfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
    }
}