class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int pp=0,p=1,cur=0;
        for(int i=2;i<=n;i++){
            cur=pp+p;
            pp=p;
            p=cur;
        }
        return cur;
    }
}