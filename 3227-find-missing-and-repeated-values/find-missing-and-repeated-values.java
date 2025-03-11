class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[]arr=new int[n*m];
        int idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[idx++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        int rpt=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                rpt=arr[i];
                break;
            }
        }
        int b=arr.length;
        int sum=b*(b+1)/2;
        int s=0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        int ans=s-rpt;
        int res=sum-ans;
        return new int[]{rpt,res};

    }
}