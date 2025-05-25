class Solution {
    public int longestPalindrome(String[] words) {
        int res = 0;
        Map<String, Integer> mp = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String rev = new StringBuilder(words[i]).reverse().toString();

            if (mp.containsKey(rev) && mp.get(rev) > 0) {
                mp.put(rev, mp.get(rev) - 1);
                res += 4;
            } else {
                if (mp.containsKey(words[i])) {
                    mp.put(words[i], mp.get(words[i]) + 1);
                } else {
                    mp.put(words[i], 1);
                }
            }
        }
        for (String word : mp.keySet()) {
            if (word.charAt(0) == word.charAt(1) && mp.get(word) > 0) {
                res += 2;
                break;
            }
        }

        return res;
    }
}
