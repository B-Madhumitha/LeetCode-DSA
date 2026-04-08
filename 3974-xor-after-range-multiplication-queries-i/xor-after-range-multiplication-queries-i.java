class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int MOD = 1_000_000_007;
        int [][] arr = queries;
        for(int[] x:arr){
            int li=x[0], ri=x[1], ki=x[2], vi=x[3];
            for(int i=li;i<=ri;i+=ki){
                nums[i] = (int)(((long)nums[i]*vi)%MOD);
            }
        }
        int ans = 0;
        for(int n:nums) ans ^= n;
        return ans;
    }
}