class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0,ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cs=cs+nums[i];
            ans=Math.max(ans,cs);
            if(cs<0){
                cs=0;
            }
        }
        return ans;
    }
}