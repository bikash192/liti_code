class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                int x=Math.abs(nums[nums.length-1]-nums[0]);
                max=Math.max(max,x);
                break;
            }
            int n=Math.abs(nums[i+1]-nums[i]);
            max=Math.max(n,max);

        }
        return max;
    }
}