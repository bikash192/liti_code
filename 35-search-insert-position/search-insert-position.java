class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,h=nums.length-1, ans=nums.length;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]>=target){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
}