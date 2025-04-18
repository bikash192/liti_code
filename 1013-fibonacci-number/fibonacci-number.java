class Solution {
    public int fun(int[]arr,int n){
        if(n==0||n==1) return n;
        if(arr[n]!=-1) return arr[n];
        int ans=fun(arr,n-1)+fun(arr,n-2);
        arr[n]=ans;
        return arr[n];
    }
    public int fib(int n) {
    int[] dp=new int[n+1];
    Arrays.fill(dp,-1);
     return fun(dp,n);    
    }
}