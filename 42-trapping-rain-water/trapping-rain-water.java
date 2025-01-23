class Solution {
    public int trap(int[] a) {
        int lmax=0,rmax=0,sum=0;
        int i=0,j=a.length-1;
        while(i<=j){
            if(a[i]<=a[j]){
                if(a[i]>=lmax){
                    lmax=a[i];
                }
                else{
                    sum+=lmax-a[i];
                }
                i++;
            }
            else{
                if(a[j]>=rmax){
                    rmax=a[j];
                }
                else{
                    sum+=rmax-a[j];
                }
                j--;
            }
        }
            
        return sum;
    }
}