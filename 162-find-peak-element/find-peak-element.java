class Solution {
    public int findPeakElement(int[] a) {
      int l=0,h=a.length-1,ans=-1;
      int n=a.length;
      if(n==1) return 0;
      while(l<=h){
        int m=l+(h-l)/2;
        if(m==0&&a[m]>a[m+1]||m==n-1&&a[m]>a[m-1]){
            return m;
        }
        else if(m>0&&m<n-1&&a[m]>a[m+1]&&a[m]>a[m-1]){
            return m;
        }
        else if(m==0||a[m-1]<a[m]){
            l=m+1;
        }
        else{
            h=m-1;
        }
      }
      return 0;
    }
}