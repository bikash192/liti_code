class Solution {
    public int fun(String s,int[]dp,int i){
        if(i>=s.length())return 1;
        if(s.charAt(i)=='0') return 0;
        if(dp[i]!=-1) return dp[i];
        int sd=fun(s,dp,i+1);
        int dd=0;
        if(i!=s.length()-1&&(s.charAt(i)-'0')*10+(s.charAt(i+1)-'0')<=26){
            dd=fun(s,dp,i+2);
        }
        dp[i]=sd+dd;
        return dp[i];
    }
    public int numDecodings(String s) {
        int[]dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return fun(s,dp,0);
    }
}