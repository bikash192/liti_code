class Solution {
    public void swap(int[]a,int l,int r){
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
    }
    public void sortColors(int[] nums) {
       int l=0,m=0,h=nums.length-1;
       while(m<=h){
        if(nums[m]==0){
            swap(nums,l,m);
            l++;
            m++;
        }
        else if(nums[m]==2){
            swap(nums,m,h);
            h--;
        }
        else{
            m++;
        }
       } 
    }
}