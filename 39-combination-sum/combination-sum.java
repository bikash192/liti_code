class Solution {
    public void c_sum(int[]a,int id,int t,List<Integer>cur,List<List<Integer>> ans){
        int n=a.length;
        if(id==n){
            if(t==0){
                ans.add(new ArrayList<>(cur));
            }
            return ;
        }
        if(a[id]<=t){
            cur.add(a[id]);
            c_sum(a,id,t-a[id],cur,ans);
            cur.remove(cur.size()-1);
        }
        c_sum(a,id+1,t,cur,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        c_sum(candidates,0,target,cur,ans);
        return ans;
    }
}