class Solution {
    public int rob(int[] nums) {
        int p1 = 0, p2 = 0, ans = 0;
        for(int i=0;i<nums.length;i++){
            ans = Math.max(p2,nums[i]+p1);
            p1 = p2;
            p2 = ans;
        }
        return ans;
    }
}