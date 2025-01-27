class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,maxl=0;
        int n=s.length();
        HashMap<Character,Integer> hs=new HashMap<>();
        while(j<n){
            hs.put(s.charAt(j),hs.getOrDefault(s.charAt(j),0)+1);
            while(hs.size()<j-i+1){
                hs.put(s.charAt(i),hs.get(s.charAt(i))-1);
                if(hs.get(s.charAt(i))==0){
                    hs.remove(s.charAt(i));
                }
                i++;
            }
            if(hs.size()==j-i+1){
                maxl=Math.max(maxl,j-i+1);
            }
            j++;
        }
        return maxl;
    }
}