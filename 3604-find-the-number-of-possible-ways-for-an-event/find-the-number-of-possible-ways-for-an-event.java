class Solution {
    private static final long mod = 1000000007;
    private static long[][] s = new long[1001][1001];
    static{
        s[0][0] = 1;
        for(int i=1;i<=1000;i++){
            for(int j=1;j<=i;j++){
                s[i][j] = (s[i-1][j-1] + s[i-1][j]*j)%mod;
            }
        }
    }
    public int numberOfWays(int n, int x, int y) {
        long res = 0, perm = 1, pow = 1;
        for(int i=1;i<=Math.min(n,x);i++){
            perm = perm*(x-i+1)%mod;
            pow = pow*y%mod;
            res = (res+perm*s[n][i]%mod*pow)%mod;
        }
        return (int)res;
    }
}