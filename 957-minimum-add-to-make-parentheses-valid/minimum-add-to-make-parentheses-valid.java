class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length(),c=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) c++;
                else{
                    if(ch==')'&&st.peek()=='('){
                        st.pop();
                    }
                }
            }
        }
        return st.size()+c;
    }
}