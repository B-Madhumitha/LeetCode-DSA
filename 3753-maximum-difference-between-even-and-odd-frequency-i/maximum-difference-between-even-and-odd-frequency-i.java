class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        int odd = Integer.MIN_VALUE, even = Integer.MAX_VALUE;
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int f:freq){
            if(f>0){
                if(f%2==0){
                    if(f<even) even=f;
                }
                else{
                    if(f>odd) odd=f;
                }
            }
        }
        if(odd == Integer.MIN_VALUE||even == Integer.MAX_VALUE) return 0;
        else return odd-even;
    }
}