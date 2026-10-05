class Solution {
    public static int scoreOfParentheses(String s) {
        Stack<Integer> st= new Stack<>();
        st.push(0);
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(0);
            }
            else{
                int in=st.pop();
                int score=0;
                if(in==0){
                    score=1;
                }
                else{
                    score=2*in;
                }
                int previous = st.pop();
                st.push(previous + score);
            }
        }
        return st.pop();
        
    }
}