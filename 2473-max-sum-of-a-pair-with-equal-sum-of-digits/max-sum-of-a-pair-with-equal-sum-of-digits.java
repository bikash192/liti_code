class Solution {
    public int sum(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=r;
            n/=10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int max=-1;
        for(int number:nums){
            int digit=sum(number);
            if(hs.containsKey(digit)){
                max=Math.max(max,number+hs.get(digit));
            }
            hs.put(digit,Math.max(hs.getOrDefault(digit,0),number));
        }
        return max;
    }
}