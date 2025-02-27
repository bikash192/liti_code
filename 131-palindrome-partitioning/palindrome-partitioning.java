class Solution {
    public void helper(String s,List<String> divide, List<List<String>> ans){
        if(s.length()==0){
            ans.add(new ArrayList<>(divide));
            return ;
        }
        for(int i=0;i<s.length();i++){
            String part=s.substring(0,i+1);
            if(isPalindrome(part)){
                divide.add(part);
                helper(s.substring(i+1),divide,ans);
                divide.remove(divide.size()-1);
            }
        }
    }
    public boolean isPalindrome(String str){
        int l=0,h=str.length()-1;
        while(l<=h){
            if(str.charAt(l)!=str.charAt(h)) return false;
            l++;
            h--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<String> divide=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        helper(s,divide,ans); 
        return ans;   
    }
}