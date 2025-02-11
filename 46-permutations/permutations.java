class Solution {
    public void get_per(int[]nums,int idx,List<List<Integer>> ans){
        if(idx==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int n:nums){
                temp.add(n);
            }
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,idx,i);
            get_per(nums,idx+1,ans);
            swap(nums,idx,i);
        }

    }
    public void swap(int []nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        get_per(nums,0,ans);
        return ans;
    }
}