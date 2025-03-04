class Solution {
    public boolean check(int p,int n){
        if(n==0) return true;
        if(Math.pow(3,p)>n) return false;
        return check(p+1,(n-(int)Math.pow(3,p)))||check(p+1,n);
    }
    public boolean checkPowersOfThree(int n) {
        return check(0,n);
    }
}