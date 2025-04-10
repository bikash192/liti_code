class Solution {
    public void check(int op,int cl,int n,String s,List<String> ans){
        if(op==n&&cl==n){
            ans.add(s);
            return ;
        }
        if(op<n){
            check(op+1,cl,n,s+"(",ans);
            

        }
        if(op>cl){
            check(op,cl+1,n,s+")",ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        String s="";
        check(0,0,n,s,ans);
        return ans;

    }
}