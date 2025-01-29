class Solution {
    public int minAddToMakeValid(String s) {
      int n=s.length();int c=0;
      Stack<Character> st=new Stack<>();
      for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(ch=='('){
            st.push(ch);
        }
        else{
            if(st.isEmpty()) c++;
            else{
                char top=st.peek();{
                    if(ch==')'&&top=='('){
                        st.pop();
                    }
                }
            }
        }
      }
      return st.size()+c;  
    }
}