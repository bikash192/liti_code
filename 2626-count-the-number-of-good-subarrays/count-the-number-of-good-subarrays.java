class Solution {
    public long countGood(int[] nums, int k) {
        int i=0,j=0,n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        long res=0;
        long pair=0;
        while(j<n){
            if(!mp.containsKey(nums[j])){
                mp.put(nums[j],1);
            }
            else{
                pair+=mp.get(nums[j]);
                mp.put(nums[j],mp.get(nums[j])+1);
            }
            while(pair>=k){
                res += (n-j);
                mp.put(nums[i],mp.get(nums[i])-1);
                pair-=mp.get(nums[i]);
                i++;
            }
            j++;
        }
        return res;
    }
}