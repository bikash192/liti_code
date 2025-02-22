class Solution {
    public String clearDigits(String s) {
        String str="";
        Stack<Character> st=new Stack<>();
        Stack<Character> temp=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int asci=(int) ch;
            if(asci>=48&&asci<=57){
                st.pop(); 
            }
            else st.push(ch);
            
        }
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        while(!temp.isEmpty()){
            str+=temp.pop();
        }
        return str; 
    }
}