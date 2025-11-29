class Solution {
    public void sortColors(int[] nums) {
        int z=0,on=0,tw=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }
            else if(nums[i]==1){
                on++;
            }
            else tw++;
        }
        int index = 0;
        while (z-- > 0) {
            nums[index++] = 0;
        }
        while (on-- > 0) {
            nums[index++] = 1;
        }
        while (tw-- > 0) {
            nums[index++] = 2;
        }
        
    }
}