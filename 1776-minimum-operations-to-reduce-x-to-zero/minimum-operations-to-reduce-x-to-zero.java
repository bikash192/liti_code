class Solution {
    public int minOperations(int[] nums, int x) {
        int total_sum=0;
        for(int i=0;i<nums.length;i++){
            total_sum+=nums[i];
        }
        
        int ss=total_sum-x;
        if(ss==0){
            return nums.length;
        }
        if(ss<0){
            return -1;
        }
       
        int j=0,i=0,maxl=0,sum=0;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>ss){
                sum-=nums[i];
                i++;
            }
            if(sum==ss){
                maxl=Math.max(maxl,j-i+1);
            }
            j++;
        }
        if(maxl==0) return -1;
        return nums.length-maxl;
    }
}