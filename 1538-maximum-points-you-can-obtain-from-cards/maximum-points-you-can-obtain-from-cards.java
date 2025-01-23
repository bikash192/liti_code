class Solution {
    public int maxScore(int[] cp, int k) {
        int ts=0;
        int n=cp.length;
        int ak=n-k;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ts+=cp[i];
        }
        int sm=0;
        for(int i=0;i<ak;i++){
            sm+=cp[i];
        }
        max=Math.max(max,(ts-sm));
        for(int i=ak;i<n;i++){
            sm+=cp[i]-cp[i-ak];
            max=Math.max(max,(ts-sm));
        }
        return max;
    }
}