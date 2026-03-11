class Solution {
    public boolean hasAlternatingBits(int n) {
        String str = Integer.toBinaryString(n);
        for(int i=0;i<str.length()-1;i++){
            char c1 = str.charAt(i);
            char c2 = str.charAt(i+1);
            if(c1==c2) return false;
        }
        return true;
    }
}