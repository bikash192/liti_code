class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = (s.length() + k - 1) / k;  
        String[] str = new String[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            int end = Math.min(j + k, s.length());
            str[i] = s.substring(j, end);

            int l = k - str[i].length();
            for (int a = 0; a < l; a++) {
                str[i] += fill;
            }

            j += k;
        }

        return str;
    }
}
