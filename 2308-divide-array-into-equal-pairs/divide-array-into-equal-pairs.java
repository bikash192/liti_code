class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hs.containsKey(nums[i])){
                hs.put(nums[i],1);
            }
            else{
                hs.put(nums[i],hs.get(nums[i])+1);
            }
        }
        
        for(int val:hs.values()){
            if(val%2!=0) return false;
        }
        return true;
    }
}