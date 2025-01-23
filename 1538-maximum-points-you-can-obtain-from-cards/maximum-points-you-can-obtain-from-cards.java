class Solution {
    public int maxScore(int[] cp, int k) {
        int n=cp.length;
        int s=0;
        int max=Integer.MIN_VALUE;
        int chal=n-k;
        for(int i=0;i<n;i++){
            s+=cp[i];
        }
        for(int i=0;i<=n-chal;i++){
            int sum=0;
            for(int j=i;j<i+chal;j++){
                sum=sum+cp[j];
            }
            max=Math.max(max,(s-sum));
        }
        return max;
    }
}