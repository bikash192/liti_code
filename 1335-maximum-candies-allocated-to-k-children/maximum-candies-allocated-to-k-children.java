class Solution {
    public boolean check(int[]c,long k,int m){
        long count=0;
        for(int i=0;i<c.length;i++){
            count+=c[i]/m;
        }
        if(count>=k){
            return true;
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        int l=1,h=max;
        int ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(check(candies,k,m)){
                ans=m;
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return ans;
    }
}