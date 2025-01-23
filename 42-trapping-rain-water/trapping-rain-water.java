class Solution {
    public int trap(int[] a) {
        int pfx[]=new int [a.length];
        int sfx[]=new int [a.length];
        int n=a.length;
         pfx[0]=a[0];
        for(int i=1;i<a.length;i++){
            pfx[i]=Math.max(pfx[i-1],a[i]);
        }
        sfx[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            sfx[i]=Math.max(sfx[i+1],a[i]);
        }
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+Math.min(pfx[i],sfx[i])-a[i];
        }
        return sum;
    }
}