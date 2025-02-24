class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String[] ss = s.trim().split("\\s+");
        for(String ch:ss){
            st.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
            if(!st.isEmpty()) sb.append(" ");
        }
        return sb.toString();
    }
}