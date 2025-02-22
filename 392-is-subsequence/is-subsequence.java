class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int n=s.length(),m=t.length();
        for(int i=0;i<m;i++){
            if(count==n) return true;
            if(t.charAt(i) == s.charAt(count)){
                count++;
            }
        }
        return count == n;
    }
}