class Solution {
    public boolean validPalindrome(String s) {
        return isPalindrome(s,0,s.length()-1,1);
    }
    boolean isPalindrome(String s, int l, int r, int c){
        while(l<r){
            char lc = s.charAt(l);
            char rc = s.charAt(r);
            if(lc!=rc){
                if(c==0) return false;
                return isPalindrome(s,l+1,r,c-1) || isPalindrome(s,l,r-1,c-1);
            }
            l++;r--;
        }
        return true;
    }
}