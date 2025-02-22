class Solution {
    public boolean helper(Stack<Character>st,String part,int n){
        Stack<Character>temp=new Stack<>();{
            temp.addAll(st);
            for(int i=n-1;i>=0;i--){
                if(temp.peek()!=part.charAt(i)){
                return false;
            }
            temp.pop();
            }
            return true;
        }
    }
    public String removeOccurrences(String s, String part) {
        int n=s.length();
        int pl=part.length();
        Stack<Character> st=new Stack<>();
        Stack<Character> temp=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            st.push(ch);
            if(st.size()>=pl){
                if(helper(st,part,pl)){
                    for(int j=0;j<pl;j++){
                        st.pop();
                    }
                }
            }
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        res.reverse();
        return res.toString();

    }
}