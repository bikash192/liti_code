class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch!='*'){
                st.push(ch);
            }
            else{
               st.pop();
            }
        }
        Stack<Character> temp=new Stack<>();
        String str="";
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        while(!temp.isEmpty()){
            str+=temp.pop();
        }
        return str;
                                                                           
    }
}