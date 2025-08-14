class Solution {
    public boolean isIdealPermutation(int[] nums) {
        int gCount = 0, lCount = 0;
        int max = nums[0];
        for (int i = 2; i < nums.length; i++) {
            max = Math.max(max, nums[i - 2]);
            if (max > nums[i]) return false;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) lCount++;
        }
        gCount = lCount;
        return gCount == lCount;
    }
}