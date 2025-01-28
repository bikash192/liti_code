class Solution {
    public boolean check(int[]p,int mid,int hour){
        long time=0;
        int n=p.length;
        for(int i=0;i<n;i++){
            time+=p[i]/mid;
            if(p[i]%mid!=0) time++;
        }
        if(time>hour) return false;
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int low=1,high=max;
        while(low<=high){
            int m=low+(high-low)/2;
        if(check(piles,m,h)==false){
            low=m+1;
        }
        else{
            ans=m;
            high=m-1;
        }
        }
        return ans;
    }
}