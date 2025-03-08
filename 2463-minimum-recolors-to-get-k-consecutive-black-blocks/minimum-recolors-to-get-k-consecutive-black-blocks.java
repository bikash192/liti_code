class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int ans=Integer.MAX_VALUE;
        int ct=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                ct++;
            }     
        }
        ans=ct;
        for(int i=k;i<n;i++){
            if(blocks.charAt(i)=='W') ct++;
            if(blocks.charAt(i-k)=='W') ct--;

            ans=Math.min(ans,ct);
        }
        return ans;
}
}