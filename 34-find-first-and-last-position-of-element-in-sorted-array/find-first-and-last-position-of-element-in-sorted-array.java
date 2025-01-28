class Solution {
    public int lower(int []arr,int t){
        int l=0,h=arr.length-1,ans=arr.length;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]>=t){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    public int upper(int[]arr,int t){
        int l=0,h=arr.length-1,ans=arr.length;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]>t){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int low=lower(nums,target);
        int high=upper(nums,target);
         if (low >= nums.length || nums[low] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{low,high-1};
    }
}