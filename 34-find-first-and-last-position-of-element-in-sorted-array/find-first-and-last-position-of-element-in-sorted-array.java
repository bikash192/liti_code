class Solution {
    public int lower(int[] a,int t){
        int l=0,h=a.length-1, ans=a.length;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]>=t){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    public int upper(int []a,int t){
        int l=0,h=a.length-1, ans=a.length;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]>t){
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
        int i=lower(nums,target);
        int j=upper(nums,target);
        int n=nums.length;
        if(i==n||nums[i]!=target){
            return new int[]{-1,-1};
        }
            return new int[]{i,j-1};
        
        
    }
}