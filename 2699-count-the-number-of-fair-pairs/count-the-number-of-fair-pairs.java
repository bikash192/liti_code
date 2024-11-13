class Solution {
        public int lowerbound(int a,int x,int[]nums){
            int l=a,h=nums.length-1;
            while(l<=h){
                int m=(l+h)/2;
                if(nums[m]>=x){
                    // ans=nums[m];
                    h=m-1;
                }
                else{
                    l=m+1;
                }
            
        }
        return l;
        }
     public int upperbound(int a,int x,int[] nums){
            int l=a,h=nums.length-1;
            while(l<=h){
                int m=(l+h)/2;
                if(nums[m]>x){
                    // ans=nums[m];
                    h=m-1;
                }
                else{
                    l=m+1;
                }
            }
            return l;
        }
    public long countFairPairs(int[] nums, int lower, int upper) {
    
      
        Arrays.sort(nums);
        long count=0;
        for(int i=0;i<nums.length;i++){
            int x=lowerbound(i+1,lower-nums[i],nums);
            int y=upperbound(i+1,upper-nums[i],nums);
        count =count+(y-x);
        }
        return count;
    }
}    
