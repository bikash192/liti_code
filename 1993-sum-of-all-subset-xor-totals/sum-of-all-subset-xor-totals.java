class Solution {
    public void subset(int[]nums,int i,List<Integer> cur,List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(cur));
            return ;
        }
        subset(nums,i+1,cur,ans);
        cur.add(nums[i]);
        subset(nums,i+1,cur,ans);
        cur.remove(cur.size()-1);
    }

    public int subsetXORSum(int[] nums) {
        int sum=0;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        subset(nums,0,cur,ans);

       for(int i=0;i<ans.size();i++){
        List<Integer> res=ans.get(i);
        int subXOR=0;
        for(int j=0;j<res.size();j++){
            subXOR^=res.get(j);
        }
        sum+=subXOR;

       }
       return sum;
        }
    }