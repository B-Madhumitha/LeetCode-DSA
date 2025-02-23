class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> mp = new HashMap<>();
        mp.put(')','(');mp.put('}','{');mp.put(']','[');
        for(char ch:s.toCharArray()){
            if(mp.containsValue(ch)){
                st.push(ch);
            }
            else if(mp.containsKey(ch)){
                if(st.isEmpty() || mp.get(ch)!=st.pop()){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}