class Solution {
    public int longestSubarray(int[] nums) {
        int i=0,j=0,maxl=0, cnt=0;
        while(j<nums.length){
            if(nums[j]==0){
                cnt++;
            }
            while(cnt>1){
                if(nums[i]==0){
                    cnt--;
                }
                i++;
            }
            maxl=Math.max(maxl,j-i+1);
            j++;
        }
        return maxl-1;
    }
}