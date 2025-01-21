class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
                ans=Math.max(ans,c);

            }
            if(nums[i]!=1){
                c=0;
            }
        }
        return ans;
    }
}