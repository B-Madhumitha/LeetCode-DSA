class Solution {
    public int longestPalindromicSubsequence(String s, int k) {
        int n = s.length();
        int [][]arr = new int[26][26];
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                arr[i][j]=Math.min(Math.abs(i-j),26-Math.abs(i-j));
            }
        }
        int[][][]dp = new int[n][n][k+1];
        for (int i=0;i<n;i++) {
            for (int it=0;it<=k;it++) {
                dp[i][i][it] = 1;
            }
        }
        for(int l=2;l<=n;l++){
            for(int i=0;i<=n-l;i++){
                int j=i+l-1;
                for(int c=0;c<=k;c++){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j][c] = 2+dp[i+1][j-1][c];
                    }
                    else{
                        int n1 = dp[i+1][j][c];
                        int n2 = dp[i][j-1][c];
                        int d = arr[s.charAt(i)-'a'][s.charAt(j)-'a'];
                        int n3 = (c>=d)?2+dp[i+1][j-1][c-d]:0;
                        dp[i][j][c] = Math.max(Math.max(n1,n2),n3);
                    }
                }
            }
        }
        return dp[0][n-1][k];
    }
}