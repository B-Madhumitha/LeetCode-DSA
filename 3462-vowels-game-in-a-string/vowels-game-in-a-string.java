class Solution {
    public boolean doesAliceWin(String s) {
        String str = "aeiouAEIOU";
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(str.indexOf(ch)!=-1) return true;
        }
        return false;
    }
}