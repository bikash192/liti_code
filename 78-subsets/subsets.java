class Solution {
    public void generateSubsets(int[] a,int id,List<Integer> cur,List<List<Integer>> result){
        int n=a.length;
        if(id==n){
            result.add(new ArrayList<>(cur));
            return ;
        }
        cur.add(a[id]);
        generateSubsets(a,id+1,cur,result);
        cur.remove(cur.size()-1);
        generateSubsets(a,id+1,cur,result);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> set=new ArrayList<>();
        generateSubsets(nums,0,set,res);
        return res;

    }
}