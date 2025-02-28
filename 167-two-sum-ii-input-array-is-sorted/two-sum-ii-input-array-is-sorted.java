class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(hs.containsKey(numbers[i])){
                return new int[]{hs.get(numbers[i]),i+1};
            }
            hs.put(target-numbers[i],i+1);
        }
        return null;
    }
}