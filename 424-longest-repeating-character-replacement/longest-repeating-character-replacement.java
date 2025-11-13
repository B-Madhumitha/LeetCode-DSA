class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int l=0,maxCount=0,maxLen=0;
        for(int r=0;r<s.length();r++){
            count[s.charAt(r)-'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(r)-'A']);
            while(r-l+1-maxCount>k){
                count[s.charAt(l)-'A']--;
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}