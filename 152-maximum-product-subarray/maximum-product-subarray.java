class Solution {
    public int maxProduct(int[] nums) {
        int pfx=1,sfx=1,max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(pfx==0) pfx=1;
            if(sfx==0) sfx=1;
            pfx=pfx*nums[i];
            sfx=sfx*nums[nums.length-1-i];
            max=Math.max(max,Math.max(pfx,sfx));
        }
        return max;

    }
}