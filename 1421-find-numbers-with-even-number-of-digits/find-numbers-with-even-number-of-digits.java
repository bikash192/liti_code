class Solution {
    public int count(int n){
        int cnt=0;
        while(n>0){
            n/=10;
            cnt++;
        }
        return cnt;
    }
    public int findNumbers(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(count(nums[i])%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}