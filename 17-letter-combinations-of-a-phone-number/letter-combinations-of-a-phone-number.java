class Solution {
    public void helper(int idx,String digits,Map<Character,String>mp,String temp,List<String>ans ){
        if(digits.length()==idx){
            ans.add(temp);
            return ;
        }
        char ch=digits.charAt(idx);
        String letters=mp.get(ch);
        for(char letter:letters.toCharArray()){
            helper(idx + 1, digits, mp, temp + letter, ans);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0) return ans;
        Map<Character,String> mp=new HashMap<>();
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");
        String str="";
        helper(0,digits,mp,str,ans);
        return ans;
    }
}