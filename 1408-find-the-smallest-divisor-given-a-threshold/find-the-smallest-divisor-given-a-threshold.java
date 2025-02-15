class Solution {
    public boolean check(int[] a,int m,int t){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=Math.ceil((double)a[i]/m);
        }
        if(sum<=t) return true;
        else return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int l=1,h=max,ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(check(nums,m,threshold)){
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