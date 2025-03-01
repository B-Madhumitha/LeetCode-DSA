class Solution {
    public static int [][]dp;
    public static int minEditDistance(String s1, String s2, int i, int j){
        if(i>=s1.length()) return s2.length()-j;
        if(j>=s2.length()) return s1.length()-i;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j))
            return dp[i][j] =  minEditDistance(s1,s2,i+1,j+1);
        int ins = 1+minEditDistance(s1,s2,i,j+1);
        int rem = 1+minEditDistance(s1,s2,i+1,j);
        int rep = 1+minEditDistance(s1,s2,i+1,j+1);
        return dp[i][j] = Math.min(ins,Math.min(rem,rep));
    }
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++){
            for(int j=0;j<word2.length();j++){
                dp[i][j] = -1;
            }
        }
        return minEditDistance(word1,word2,0,0);
    }
}