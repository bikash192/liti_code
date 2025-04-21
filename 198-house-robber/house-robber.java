class Solution {
    public int fun(int []nums,int[]dp,int i){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int p=nums[i]+fun(nums,dp,i+2);
        int np=fun(nums,dp,i+1);
        dp[i]=Math.max(p,np);
        return dp[i];
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return fun(nums,dp,0);
    }
}