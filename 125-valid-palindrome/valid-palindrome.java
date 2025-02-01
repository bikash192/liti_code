class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int left=0 ,right=n-1;
        while(left<right){
            char l=s.charAt(left);
            char r=s.charAt(right);
            if(!Character.isLetterOrDigit(l)) left++;
            else if(!Character.isLetterOrDigit(r)) right--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)) return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}