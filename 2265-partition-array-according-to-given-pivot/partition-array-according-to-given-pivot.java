class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int j=0;
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                ans.add(nums[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                ans.add(nums[i]);
            }
        }
        for(int i=j;i<n;i++){
            if(nums[i]>pivot){
                ans.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans.get(i);
        }
        return nums;
    }
}