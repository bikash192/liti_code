class Solution {
    public void p_sub(int[]a,int id,List<Integer> cur,List<List<Integer>> ans){
        if(a.length==id){
            ans.add(new ArrayList<>(cur));
            return ;
        }
        cur.add(a[id]);
        p_sub(a,id+1,cur,ans);
        cur.remove(cur.size()-1);
        int idx=id+1;
        while(idx<a.length&&a[idx]==a[idx-1]){
            idx++;
        }
        p_sub(a,idx,cur,ans);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        Arrays.sort(nums);
        p_sub(nums,0,cur,ans);
          return ans;
    }
}