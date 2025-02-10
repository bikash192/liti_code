class Solution {
    public void c_sum(int[]a,int id,int sum,int t,List<Integer> cur,List<List<Integer>> ans){
            if(sum==t){
                ans.add(new ArrayList<>(cur));
                return;
            }
        if (sum > t || id == a.length) return;
        sum+=a[id];
        cur.add(a[id]);
        c_sum(a,id+1,sum,t,cur,ans);
        sum-=a[id];
        cur.remove(cur.size()-1);
        int idx=id+1;
        while(idx<a.length&&a[idx-1]==a[idx]){
            idx++;
        }
        c_sum(a,idx,sum,t,cur,ans);

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        Arrays.sort(candidates);
        c_sum(candidates,0,0,target,cur,ans);
        return ans;
    }
}