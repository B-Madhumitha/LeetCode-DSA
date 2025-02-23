class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String[] s = path.split("/");
        for(String c : s){
            if(c.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else if(!c.equals("") && !c.equals(".")){
                st.push(c);
            }
        }
        for(String c : st){
            sb.append("/").append(c);
        }
        if(sb.length()==0) return "/";
        else return sb.toString();
    }
}