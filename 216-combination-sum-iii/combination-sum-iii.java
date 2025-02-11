class Solution {
    public void c_sum(int i,int sum,int k,int n,List<Integer> cur,List<List<Integer>> ans){       if(sum>n) return ;
        if(sum==n){
            if(k==0){
                ans.add(new ArrayList<>(cur));
            }
            return ;
        }
        if(i==10) return ;
        sum+=i;
        cur.add(i);
        c_sum(i+1,sum,k-1,n,cur,ans);
        sum-=i;
        cur.remove(cur.size()-1);
        c_sum(i+1,sum,k,n,cur,ans);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
        c_sum(1,0,k,n,cur,ans);
        return ans;
    }
}