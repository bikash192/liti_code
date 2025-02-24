class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int ans=Integer.MIN_VALUE;
        while(i<j){
            int area=(j-i)*Math.min(height[i],height[j]);
            ans=Math.max(ans,area);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}