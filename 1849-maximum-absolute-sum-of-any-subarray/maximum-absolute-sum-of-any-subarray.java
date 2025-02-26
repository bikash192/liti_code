class Solution {
    public int maxAbsoluteSum(int[] nums) {
      int sum=0,n=nums.length;
      int min_sum=Integer.MAX_VALUE;  
      int max_sum=Integer.MIN_VALUE; 
      int abs_sum=0; 
      for(int i=0;i<n;i++){
        sum+=nums[i];
        min_sum=Math.min(sum,min_sum);
        max_sum=Math.max(sum,max_sum);
        if(sum>=0){
            abs_sum=Math.max(abs_sum,(Math.max(sum,sum-min_sum)));
        }
        if(sum<=0){
            abs_sum=Math.max(abs_sum,
                    Math.max(Math.abs(sum),Math.abs(sum-max_sum))
            );
        }
      }
      return abs_sum;
    }
}