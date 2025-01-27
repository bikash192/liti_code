class Solution {
    public int longestOnes(int[] nums, int k) {
      int i=0,j=0,cnt=0,maxl=0;
      while(j<nums.length){
        if(nums[j]==0){
            cnt++;
        }
        while(cnt>k){
            if(nums[i]==0){
                cnt--;
            }
            i++;
        }
        maxl=Math.max(maxl,j-i+1);
        j++;
      }
      return maxl ;
    }
}