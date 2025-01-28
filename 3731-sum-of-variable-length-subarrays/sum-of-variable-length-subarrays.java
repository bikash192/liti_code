class Solution {
    public int subarraySum(int[] nums) {
        int i=0,sum=0;
        while(i<nums.length){
           int start=Math.max(0,i-nums[i]);
           for(int j=start;j<=i;j++){
            sum+=nums[j];
           }
           i++;
        }
        return sum; 
    }
}