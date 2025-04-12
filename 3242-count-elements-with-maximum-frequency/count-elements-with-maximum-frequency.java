class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(nums[i])){
                hs.put(nums[i],hs.get(nums[i])+1);
            }
            else{
                hs.put(nums[i],1);
            }
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int v:hs.values()){
            max=Math.max(max,v);
        }
        for(int n:hs.values()){
            if(n==max){
                sum+=n;
            }
        }
        return sum;
    }
}