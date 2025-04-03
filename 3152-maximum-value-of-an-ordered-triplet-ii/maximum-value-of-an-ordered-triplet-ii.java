class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long res = 0, ans1 = 0, ans2 = 0;
        for(int i=0;i<n;i++){
            res = Math.max(res,ans2*nums[i]);
            ans2 = Math.max(ans2,ans1-nums[i]);
            ans1 = Math.max(ans1,nums[i]);
        }
        return res;
    }
}