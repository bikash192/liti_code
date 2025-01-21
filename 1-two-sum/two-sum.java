class Solution {
    public int[] twoSum(int[] nums, int target) {
         int []arr=new int[2];
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int find=target-nums[i];
            if(mp.containsKey(find)){
                int idx1=mp.get(find);
                int idx2=i;
                arr[0]=idx1;
                arr[1]=idx2;
            }
            mp.put(nums[i],i);
        }
        return arr;
    }
}