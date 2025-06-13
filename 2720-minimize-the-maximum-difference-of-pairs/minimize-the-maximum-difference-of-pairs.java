class Solution {
    public boolean check(int[]nums,int m,int p){
        int i=0;
        int cnt=0;
        while(i<nums.length-1){
            if(Math.abs(nums[i+1]-nums[i])<=m){
                cnt++;
                i+=2;
            }
            else i+=1;
        }
        return cnt>=p;

    }
    public int minimizeMax(int[] nums, int p) {
        int n=nums.length;
        Arrays.sort(nums);
        int l=0,h=nums[n-1]-nums[0];
        int res=Integer.MAX_VALUE;
        while(l<=h){
            int m=l+(h-l)/2;
            if(check(nums,m,p)){
                res=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return res;
    }
}