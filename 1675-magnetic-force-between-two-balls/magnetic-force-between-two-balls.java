class Solution {
    public boolean possible(int []a,int force,int balls){
        int prev=a[0];
        int c=1;
        for(int i=1;i<a.length;i++){
            int cur=a[i];
            if(cur-prev>=force){
                prev=cur;
                c++;
            }
        }
        return c>=balls;
    }
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        int l=1,res=0, h=position[n-1]-position[0];
        while(l<=h){
            int mid=(l+h)/2;
            if(possible(position,mid,m)){
                res=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return res;
    }
}