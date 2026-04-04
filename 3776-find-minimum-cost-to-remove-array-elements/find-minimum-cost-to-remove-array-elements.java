class Solution {
    public int cal(int ext, int ind, int[] nums, int[][] dp) {
        if (ind == nums.length) return nums[ext];
        if (ind == nums.length - 1) return Math.max(nums[ext], nums[ind]);
        if (dp[ind][ext] != -1) return dp[ind][ext];
        int f = Math.max(nums[ind], nums[ind + 1]) + cal(ext, ind + 2, nums, dp);
        int s = Math.max(nums[ext], nums[ind + 1]) + cal(ind, ind + 2, nums, dp);
        int t = Math.max(nums[ext], nums[ind]) + cal(ind + 1, ind + 2, nums, dp);
        return dp[ind][ext] = Math.min(f, Math.min(s, t));
    }
    public int minCost(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n + 1][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return cal(0, 1, nums, dp);
    }
}