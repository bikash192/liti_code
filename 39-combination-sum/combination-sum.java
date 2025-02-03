class Solution {
    public void c_sum(int []a,int id,List<Integer> cur,int t,List<List<Integer>> ans){
        int n=a.length;
        if(id==n){
            if(t==0){
                ans.add(new ArrayList<>(cur));
            }
            return ;
        }
        if(a[id]<=t){
            cur.add(a[id]);
            c_sum(a,id,cur,t-a[id],ans);
            cur.remove(cur.size()-1);
        }
        c_sum(a,id+1,cur,t,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> v=new ArrayList<>();
        c_sum(candidates,0,v,target,ans);
        return ans;
    }
}