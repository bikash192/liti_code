class Solution {
    public int minOperations(int[][] grid, int x) {
        int n=grid.length;
        int m=grid[0].length;
        int []arr=new int[n*m];
        int res=0;
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        int med=arr[arr.length/2];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%x!=med%x){
                return -1;
            }
            else{
                res+=Math.abs(med-arr[i])/x;
            }
        }
        return res;
    }
}