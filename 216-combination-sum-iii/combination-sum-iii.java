class Solution {
    public void c_sum(int i,int sum,int k,int n,List<Integer>cur,           List<List<Integer>> ans){
        if(sum>n) return ;
        if(k==0){
            if(sum==n){
                ans.add(new ArrayList<>(cur));
            }
            return ;
        }
         if(i==10) return;
        cur.add(i);
        sum+=i;
        c_sum(i+1,sum,k-1,n,cur,ans);
        cur.remove(cur.size()-1);
        sum-=i;
        c_sum(i+1,sum,k,n,cur,ans);

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        c_sum(1,0,k,n,cur,ans);
        return ans;
    }
}