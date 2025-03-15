class Solution {
    public boolean check(int[]nums,int k,int m){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=m){
                count++;
                i++;
            }
        }
        return count>=k;
    }
    public int minCapability(int[] nums, int k) {
        int l= Arrays.stream(nums).min().getAsInt();
        int h= Arrays.stream(nums).max().getAsInt();
        int ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(check(nums,k,m)){
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