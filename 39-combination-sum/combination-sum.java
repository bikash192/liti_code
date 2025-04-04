class Solution {
    public void sum(int[]arr,int tar,int i,int s,List<Integer>cur,List<List<Integer>>ans){
        if(i==arr.length&&s==tar){
            ans.add(new ArrayList<>(cur));
            return ;
        }
        if(i==arr.length&&s!=tar) return ;
        if(s>tar) return ;
        sum(arr,tar,i+1,s,cur,ans);
        cur.add(arr[i]);
        sum(arr,tar,i,s+arr[i],cur,ans);
        cur.remove(cur.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        sum(candidates,target,0,0,cur,ans);
        return ans;
    }
}