class Solution {
    public String removeStars(String s) {
        String str = ""; 

        for (char ch : s.toCharArray()) {
            if (ch != '*') {
                str += ch; 
            } else if (!str.isEmpty()) {
                str = str.substring(0, str.length() - 1); 
            }
        }

        return str;
    }
}
