class Solution {
    public int balancedStringSplit(String s) {
        int rc = 0, lc = 0, ans = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R') rc++;
            else if(s.charAt(i)=='L') lc++;
            if(rc == lc) ans++;
        }
        return ans;
    }
}