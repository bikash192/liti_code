class Solution {
    public boolean check(int []w,int m,int d){
        int sum=0,count_days=0;
        for(int i=0;i<w.length;i++){
            sum+=w[i];
            if(sum>m){
                count_days++;
                sum=0;
                i--;
            }
            
    }
    if(sum>0) count_days++;
    return count_days<=d;
    }

    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int ans=0;
        int max_w=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            max_w=Math.max(max_w,weights[i]);
        }
        int low=max_w,high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
        if(check(weights,mid,days)==false){
            low=mid+1;
        }
        else{
            ans=mid;
            high=mid-1;
        }
        }
        return ans;
    }
}