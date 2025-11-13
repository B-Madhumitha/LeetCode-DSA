class Solution {
    public int compress(char[] chars) {
        int idx=0;
        for(int i=0;i<chars.length;){
            char cur = chars[i];
            int count = 0;
            while(i<chars.length && chars[i]==cur){
                i++;
                count++;
            }
            chars[idx++] = cur;
            if(count>1){
                for(char c: String.valueOf(count).toCharArray()){
                    chars[idx++] = c;
                }
            }
        }
        return idx;
    }
}