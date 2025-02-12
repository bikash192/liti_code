class Solution {
    public void c_phone(String digits,int idx,String temp,Map<Character,String> mp,List<String> ans){
        if(digits.length()==0) return;
        if(idx==digits.length()){
            ans.add(temp);
            return;
        }
        char ch=digits.charAt(idx);
        String s=mp.get(ch);
        for(char c:s.toCharArray()){
            c_phone(digits,idx+1,temp+c,mp,ans);
        }
    }
    
    public List<String> letterCombinations(String digits) {
        Map<Character,String> mp=new HashMap<>();
        List<String> ans=new ArrayList<>();
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");
        String s="";
        c_phone(digits,0,s,mp,ans);
        return ans;
    }
}
