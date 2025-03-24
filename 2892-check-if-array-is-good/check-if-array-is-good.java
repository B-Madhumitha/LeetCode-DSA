class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        for(int i=0;i<=n-1;i++){
            if(nums[i]!=i+1) return false;
        }
        if(nums[n]==n) return true;
        return false;
    }
}