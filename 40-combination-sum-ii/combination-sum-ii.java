class Solution {
    public void c_sum(int []a,int id,int t,List<Integer> cur,List<List<Integer>> ans){
        if(t==0){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i=id;i<a.length;i++){
            if(i>id&&a[i]==a[i-1]) continue;
            if(a[id]>t) break;
            cur.add(a[i]);
            c_sum(a,i+1,t-a[i],cur,ans);
            cur.remove(cur.size()-1);
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        Arrays.sort(candidates);
        c_sum(candidates,0,target,cur,ans);
        return ans;
    }
}