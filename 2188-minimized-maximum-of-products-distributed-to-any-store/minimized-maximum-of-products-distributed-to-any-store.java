class Solution {
    public int minimizedMaximum(int n, int[] q) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<q.length;i++){
            max=Math.max(max,q[i]);
        }
        int l=1,h=max,res=max;
        while(l<=h){
            int mid=(l+h)/2;
            int sum=0;
            for(int i=0;i<q.length;i++){
                sum += (int) Math.ceil((double) q[i] / mid);
            }
            if(sum<=n){
                res=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
}