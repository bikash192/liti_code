class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, max = 0;
        Map<Character, Integer> mp = new HashMap<>();
        
        while (r < s.length()) {
            char ch = s.charAt(r);
            if (mp.containsKey(ch) && mp.get(ch) >= l) {
                l = mp.get(ch) + 1;
            }
            mp.put(ch, r);
            max = Math.max(max, r - l + 1);
            r++;
        }
        return max;
    }
}
