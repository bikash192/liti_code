class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    long res = (long)(nums[i] - nums[j]) * nums[k];

                    ans=Math.max(ans,res);
                }
            }
        }
        return ans;
    }
}